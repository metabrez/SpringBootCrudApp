<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../teams/${team.teamKey}" method="post">

	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="${team.name}" /> </td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="city" value="${team.city}" /> </td>
		</tr>
		<tr>
			<td>Mascot:</td>
			<td><input type="text" name="mascot" value="${team.mascot}" /> </td>
		</tr>
		<tr>
			<td>Home Uniform:</td>
			<td><input type="text" name="homeUniform" value="${team.homeUniform}" /> </td>
		</tr>
		<tr>
			<td>Visit Uniform:</td>
			<td><input type="text" name="visitUniform" value="${team.visitUniform}" /> </td>
		</tr>
	</table>
	<input type="submit" value="update"/>
	</form>
	<%-- <form action="delete?teamKey=${team.teamKey}" method="POST">
		<button type="submit">Delete</button>
	</form> --%>
</body>
</html>