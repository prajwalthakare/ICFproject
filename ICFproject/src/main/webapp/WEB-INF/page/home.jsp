<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import ="java.util.ArrayList" %>

<%@page import ="com.java.entity.Employee" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee list</title>
</head>
<body>
<% ArrayList<Employee> list=(ArrayList<Employee>)request.getAttribute("list"); %>

<%
String msg=(String)request.getAttribute("msg");

out.println(msg);
%>	
	<center>
	<h2>Employee Details</h2>

	<table border="3">
	
	
	<%
	
	for(Employee emp:list)
	{
	%>
	<tr>
	<td><a href="delete?id=<%=emp.getId() %>">Delete</a></td>
	</tr>
	<tr>
		<td><a href="addemp?id=<%=emp.getId() %>">Add Employee</a></td>
	</tr>
	<tr>
		<td><a href="update?id=<%=emp.getId() %>">Update</a></td>
	</tr>
	
	

	<th>Personal Detail</th>

	<tr>
	    <td> Employee No.:- </td>
		<td><%out.println(emp.getId()); %></td>
		</tr>
		
		<tr>
		<td>First Name:- </td>
		<td><%out.println(emp.getFirstname()); %></td>
		</tr>
		
		<tr>
		<td>Lastname:- </td>
		<td><%out.println(emp.getLastname()); %></td>
		</tr>
		
		<tr>
		<td>Date Of Birth:- </td>
		<td><%out.println(emp.getDob()); %></td>
		</tr>
		
		<tr>
		<td>Gender:- </td>
		<td><%out.println(emp.getGender()); %></td>
		</tr>
		
		<tr>
		<td>Blood Group:- </td>
		<td><%out.println(emp.getBloodgroup()); %></td>
		</tr>
		
		<tr>
		<td>Address- </td>
		<td><%out.println(emp.getAddress()); %></td>
		</tr>
		<tr>
		<td>Relationship- </td>
		<td><%out.println(emp.getRelationship()); %></td>
		</tr>
		<tr>
		<th>Employment Details</th>
		</tr>
		
		<tr>
		<td>Employment ID:- </td>
		<td><%out.println(emp.getEmployeeid()); %></td>
		</tr>
		
		<tr>
		<td>Designation:- </td>
		<td><%out.println(emp.getDesignation()); %></td>
		</tr>
		
		<tr>
		<td>Starting Date:- </td>
		<td><%out.println(emp.getStartdate()); %></td>
		</tr>
		
		<tr>
		<td>Ending Date:- </td>
		<td><%out.println(emp.getEnddate()); %></td>
		</tr>
		
		<tr>
		<td>Reporting Manager:- </td>
		<td><%out.println(emp.getReportingmanager()); %></td>
		</tr>
		
		<tr>
		<th>Education Details</th>
		</tr>
		
		<tr>
		<td>Institute Name:- </td>
		<td><%out.println(emp.getInstitution()); %></td>
		</tr>
		<tr>
		<td>Status:- </td>
		<td><%out.println(emp.getStatus()); %></td>
		</tr>
		
		<tr>
		<td>Type:- </td>
		<td><%out.println(emp.getType()); %></td>
		</tr>
		
		<tr>	
		<td>Percentage :- </td>
		<td><%out.println(emp.getPercentage()); %></td>
		
	</tr>
	
	<tr>
	<td>______</td>
	<td>________</td>
	</tr>
	<%
	}
	%>
	</table>
	
	</center>
</body>
</html>