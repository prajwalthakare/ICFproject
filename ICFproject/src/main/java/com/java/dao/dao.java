package com.java.dao;

import java.util.List;





import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.java.entity.Employee;
import com.java.entity.User;
@Repository
public class dao {
	@Autowired
	SessionFactory sessionfactory;
Employee employee;
// Dao Layer 

//for loginpage
	public boolean checklogin(User user) {
		
		//login Connection and process
		String username=user.getUsername();
		
		String password=user.getPassword();
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.add(Restrictions.eq("username",username));
	
		criteria.add(Restrictions.eq("password",password));
		List<User> listuser=criteria.list();
		if(!listuser.isEmpty())
		{
		
			return true;
		}
		else
		{
		
			return false;
		}
	}

//Iterate a list for home page
	public List<Employee> getemp() {
		Session session=sessionfactory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee>listemp=criteria.list();
			return listemp;
	}

// Add to the record using query fire through hibernate
	public boolean addemp(Employee emp) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		
		session.save(emp);
		transaction.commit();
		
		return true;
	}

//Delete Record from database
	public boolean deleteemp(int stid) {
		Session session=sessionfactory.openSession();
		org.hibernate.Transaction transcation=session.beginTransaction();
		Employee emp=session.get(Employee.class, stid);
		session.delete(emp);
		
		transcation.commit();
		
		return true;
	}

// for update employee
	public List<Employee> getproj(int idprj) {
		System.out.println("d1");
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		System.out.println("d2");
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id",idprj));
		System.out.println("d3");
		List<Employee>listproj=criteria.list();
	
		System.out.println("d4");
		
		return listproj;
	}

//update a session
	public boolean updateproj(Employee proj) {
		
		System.out.println("d5");
		Session session=sessionfactory.openSession();
		
		org.hibernate.Transaction transaction=session.beginTransaction();
		System.out.println("d6");
		session.saveOrUpdate(proj);
		
		System.out.println("update");
		
		transaction.commit();
		
		return true;
	}


}
