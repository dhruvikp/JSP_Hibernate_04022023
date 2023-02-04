<%@page import="com.simplilearn.dao.EmployeeDao"%>
<%@page import="com.simplilearn.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String salary = request.getParameter("salary");
		String dept = request.getParameter("dept");

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setDepartment(dept);
		employee.setSalary(Double.valueOf(salary));

		EmployeeDao.addEmployee(employee);
	%>

</body>
</html>