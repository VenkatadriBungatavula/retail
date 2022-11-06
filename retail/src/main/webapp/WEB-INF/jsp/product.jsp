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
<a href ="/product"><button style="background-color:blue;color:white">CreateProduct</button></a>

<br>
<br>
<br>
<br>
<a href ="/login"><button style="background-color:blue;color:white">LOGOUT</button></a>
</center>
<br><br><br>
<table border=2 width=100%>
<tr><td>Prod_ID</td><td>NAME</td><td>PRICE</td><td>ACTION</td></tr>
<c:forEach items="${productList}" var="product">
<tr><td>${product.pID}</td><td>${product.pName}</td><td>${product.pPrice}</td>
<td><a href ="/deleteProduct/${product.pID}"><button>Delete</button></a></td></tr>
</c:forEach>
</table>
<br>
<br>
<br>
<br>
<br>

<hr>
<center>@copyrightsangeethasolutions</center>
<hr>
</body>
</html>