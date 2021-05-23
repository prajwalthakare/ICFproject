<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     <%@page import ="com.java.entity.Employee" %>
     <%@ page import="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Data</title>
</head>

<% List<Employee> list=(List<Employee>)request.getAttribute("list");  %>
<body>
	<center>
	<h2>Update Employee</h2>
	<form action="updateparticularpro">
	<%
	for(Employee prj:list)
	{
	 %>
	<table border="1">
	<tr>
		<td>Enter ID:-</td>
		<td><input type="text" name="Idprojects" value="<%out.println(prj.getId());%>"></td>
	</tr>
	<tr>
		<td>Enter First Name:-</td>
		<td><input type="text" name="Firstname" value="<%out.println(prj.getFirstname());%>"></td>
	</tr>
	<tr>
		<td>Enter Last Name:-</td>
		<td><input type="text" name="Lastname" value="<%out.println(prj.getLastname());%>"></td>
	</tr>
	
	<tr>
		<td>Enter Gender:-</td>
		<td><input type="text" name="dob" value="<%out.println(prj.getGender());%>"></td>
	</tr>
	<tr>
		<td>Enter Date of Birth:-</td>
		<td><input type="text" name="gender" value="<%out.println(prj.getDob());%>"></td>
	</tr>
	<tr>
		<td>Enter Blood Group:-</td>
		<td><input type="text" name="bloodgroup" value="<%out.println(prj.getBloodgroup());%>"></td>
	</tr>
	<tr>
		<td>Enter Address:-</td>
		<td><input type="text" name="address" value="<%out.println(prj.getAddress());%>"></td>
	</tr>
	<tr>
		<td>Enter Relationship:-</td>
		<td><input type="text" name="relationship" value="<%out.println(prj.getRelationship());%>"></td>
	</tr>
	<th> Employment Details</th>
	<tr>
		<td>Enter Employee ID:-</td>
		<td><input type="text" name="dob" value="<%out.println(prj.getEmployeeid());%>"></td>
	</tr>
	
	<tr>
		<td>Enter Start date:-</td>
		<td><input type="text" name="startdate" value="<%out.println(prj.getStartdate());%>"></td>
	</tr>
	
	<tr>
		<td>Enter End date:-</td>
		<td><input type="text" name="enddate" value="<%out.println(prj.getEnddate());%>"></td>
	</tr>
	<tr>
		<td>Enter Designation:-</td>
		<td><input type="text" name="designation" value="<%out.println(prj.getDesignation());%>"></td>
	</tr>
	<tr>
		<td>Enter Reporting Manager:-</td>
		<td><input type="text" name="reportingmanager" value="<%out.println(prj.getReportingmanager());%>"></td>
	</tr>
	<th> Education Details</th>
	<tr>
		<td>Enter Institute:-</td>
		<td><input type="text" name="institution" value="<%out.println(prj.getInstitution());%>"></td>
	</tr>
	<tr>
		<td>Enter Status:-</td>
		<td><input type="text" name="status" value="<%out.println(prj.getStatus());%>"></td>
	</tr><tr>
		<td>Enter Type:-</td>
		<td><input type="text" name="type" value="<%out.println(prj.getType());%>"></td>
	</tr>

	<tr>
		<td>Enter Percentage:-</td>
		<td><input type="text" name="percentage" value="<%out.println(prj.getPercentage());%>"></td>
	</tr>
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit"></td>
	</tr>
	</table>
	<%
	
	}
	%>
	</form>
	
	</center>
</body>
</html>