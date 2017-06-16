<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teams</title>
</head>
<body>
	<h1>List of Stadiums</h1>
 
	<table border="2">
		<tr>
		<td>ID</td>
			<td>Name</td>
			<td>City</td>
			<td>State</td>
			
			<td>Edit Stadium</td>
			<td>Delete Stadium</td>
		</tr>
		<c:forEach var="stadium" items="${stadiumListKey}">
			<tr>
			<td>${stadium.stadiumKey}</td>
				<td>${stadium.name}</td>
				<td>${stadium.city}</td>
				<td>${stadium.state}</td>
				
				<td><a href="stadiums/${stadium.getStadiumKey()}">edit</a></td>
				<td><a href="stadiums/delete/${stadium.getStadiumKey()}">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>

	<a href="addStadium.jsp"> Add Stadium</a>
</body>
</html>