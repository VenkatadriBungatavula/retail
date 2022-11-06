<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retail</title>
</head>
<body style="background-color:pink">
<hr>
<center>
<h1 style="color:red">SUPER MARKET</h1>
<hr>
<br>
<br>
<br>
<h2 style="color:blue">"Retail Shop"</h2>
<h3>(AA)</h3>
<br>
where quality leads!
<br>
<br>
<a href ="/home"><button style="background-color:blue;color:white">HOME</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href ="/employee"><button style="background-color:blue;color:white">EMPLOYEE</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href ="/product"><button style="background-color:blue;color:white">PRODUCT</button></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<br>
<br>
<br>
<br>
<a href ="/login"><button style="background-color:blue;color:white">LOGOUT</button></a>

<br><br><br>
<table border=2 width=100%>
<tr><td>Emp_ID</td><td>NAME</td><td>DOB</td><td>SALARY</td><td>ACTION</td></tr>
<c:forEach items="${employeeList}" var="employee">
<tr><td>${employee.eID}</td><td>${employee.eName}</td><td>${employee.eDOB}</td><td>${employee.eSalary}</td>
<td><a href ="/deleteEmployee/${employee.eID}"><button>Delete</button></a></td></tr>
</c:forEach>
</table>

<br>
<br>
<br>
<a href ="/createEmployee"><button style="background-color:blue;color:white">Create Employee</button></a>
<br>
<br>


<hr>
<center>@copyrightsangeethasolutions</center>
<hr>
</center>
</body>
</html>