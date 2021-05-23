package com.java.ser;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.dao;


import com.java.entity.Employee;
import com.java.entity.User;
@Service
public class service {
	/// Service Layer
	
	@Autowired
	dao mvcd;
	//service layer for user
	public boolean checklogin(User user) {
		System.out.println("111566");
		
		boolean result=mvcd.checklogin(user);
		return result;
	}
	
	//service layer for employee list fetch
	public List<Employee> getemp() {
		 List<Employee> listemp=mvcd.getemp();
			return listemp;
	}

//service layer for add employee
	public boolean addemp(Employee emp) {
	
		return mvcd.addemp(emp);
	}

	//service layer for delete employee
	public boolean deleteemp(int stid) {
	
		return mvcd.deleteemp(stid);
	}
	
	//service layer for list of employee using particular ID
	public List<Employee> getproj(int idprj) {
		List<Employee> listproj=mvcd.getproj(idprj);
		System.out.println("s1");
		return listproj;
	}

	////service layer for update employee
	public boolean updateproj(Employee proj) {
		System.out.println("s2");
		return mvcd.updateproj(proj);
	}

}
