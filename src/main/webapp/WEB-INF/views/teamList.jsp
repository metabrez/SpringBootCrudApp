

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
	<h1>Teams</h1>

	<table border="2">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>City</td>
			<td>Home Uniform</td>
			<td>Visit Uniform</td>
			<td>Edit Team</td>
			<td>Delete Team</td>
		</tr>
		<c:forEach var="team" items="${teamListKey}">
			<tr>
				<td>${team.teamKey}</td>
				<td>${team.name}</td>
				<td>${team.city}</td>
				<td>${team.homeUniform}</td>
				<td>${team.visitUniform}</td>
				<td><a href="teams/${team.getTeamKey()}">edit</a></td>
				<td><a href="teams/delete/${team.getTeamKey()}">Delete</a></td>

			</tr>
		</c:forEach>
	</table>

	<a href="addTeam.jsp"> Add a Team</a>
</body>
</html>