package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.entity.Employee;
import com.java.entity.User;
import com.java.ser.service;

@ComponentScan("com.java")
@Controller
@EnableWebMvc

public class controller {
	@Autowired
	 service mvcser;
 
	
	// User login......
	@RequestMapping("/loginpage")
	public String openloginpage() {
		
		return "login";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView checkloging(@ModelAttribute User user){
		ModelAndView mv=new ModelAndView();
		
		boolean result=mvcser.checklogin(user);
	
		
		if(result){
			System.out.println(user.getUsername());
			
			mv.setViewName("redirect:/home");
		}
		else{
			mv.setViewName("login");
		}
		return mv;
	}
	
	// for home page
	@RequestMapping("/home")
	public  ModelAndView openhomepage(){
	
		ModelAndView mv=new ModelAndView();
		List<Employee> listemp=mvcser.getemp();
		if(!listemp.isEmpty()){
			mv.addObject("list",listemp);
			mv.setViewName("home");
		}
		else{
			
			mv.addObject("list",listemp);
			mv.setViewName("login");
		}
	
		return mv;
		
	}
	
	
	// for Adding employee
	@RequestMapping("/addemp")
	public String openAdduser()
	{
		return "addemp";
	}
	
	
	@RequestMapping("/addpage")
	public ModelAndView addcor(@ModelAttribute Employee emp)
	{
		ModelAndView mv=new ModelAndView();
		if(mvcser.addemp(emp))
		{
			 List<Employee> listemp=mvcser.getemp();
			 mv.addObject("list", listemp);
			 mv.setViewName("redirect:/home");
		}
		else
		{
			mv.addObject("msg", "something Went Wrong!");
		}
		return mv;
	}
	
	/// for delete employee
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") String id){
		
		ModelAndView mv=new ModelAndView();
		int stid=Integer.parseInt(id);
	
		
		if(mvcser.deleteemp(stid)){
	
			List<Employee> listemp=mvcser.getemp();
			mv.addObject("list",listemp);
			mv.setViewName("home");
			
		
		}
		else{
			mv.addObject("msg", "something wnt wrong");
		}
		
		
		return mv;
		
		
	}
	
	
	///projects list ____
		@RequestMapping("/update")
		public ModelAndView getprj(@RequestParam("id") String id)
		{
			System.out.println("up1");
			ModelAndView mv=new ModelAndView();
			int idprj=Integer.parseInt(id);
			
			List<Employee>lists=mvcser.getproj(idprj);
			System.out.println("j2");
		if(!lists.isEmpty())
			{
			System.out.println("up2");
				mv.addObject("list", lists);
				
				mv.setViewName("update");
				
			}
			else
			{
				mv.addObject("msg", "Something went wrong!");
				mv.setViewName("home");
			}
			return mv;
		}
		
		//update project 
		@RequestMapping("/updateparticularpro")
		public ModelAndView update(@ModelAttribute Employee proj)
		{
			ModelAndView mv=new ModelAndView();
		
			if(mvcser.updateproj(proj))
			{
				
				 List<Employee> listprj=mvcser.getemp();
				
				 mv.addObject("list", listprj);
				 mv.setViewName("home");
			}
			else
			{
				mv.addObject("msg", "something Went Wrong!");
			}
			return mv;
		}


}
