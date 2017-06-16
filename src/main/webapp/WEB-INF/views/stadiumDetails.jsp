<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<form action="../stadiums/${stadium.stadiumKey}" method="post">

	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="${stadium.name}" /> </td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="city" value="${stadium.city}" /> </td>
		</tr>
		<tr>
			<td>State:</td>
			<td><input type="text" name="state" value="${stadium.state}" /> </td>
		</tr>
		
	</table>
	<input type="submit" value="update"/>
	</form>
	
</body>
</html>