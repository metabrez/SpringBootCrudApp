<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
private long matchKey;
	 private Date date;
	 private Date startTime;
	 private Stadium stadium;
	 private int homeScore;
	 private int visitorScore;
	 private Team visitorTeam;
	 private Team homeTeam;
	 
	 <table>
		<tr>
			<td>Date:</td>
			<td><input type="text" name="date" value="${match.date}" /> </td>
		</tr>
		<tr>
			<td>startTime</td>
			<td><input type="text" name="startTime" value="${match.startTime}" /> </td>
		</tr>
		<tr>
			<td>Stadium:</td>
			<td><input type="text" name="stadium" value="${match.stadium}" /> </td>
		</tr>
		<tr>
		<td>Home Score:</td>
			<td><input type="text" name="homeScore" value="${match.homeScore}" /> </td>
		</tr>
		<tr>
		<td>Visitor Score:</td>
			<td><input type="text" name="visitorScore" value="${match.visitorScore}" /> </td>
		</tr>
		<tr>
		<td>Visitor Team:</td>
			<td><input type="text" name="visitorTeam" value="${match.visitorTeam}" /> </td>
		</tr>
		<tr>
		<td>Home Team:</td>
			<td><input type="text" name="homeTeam" value="${match.homeTeam}" /> </td>
		</tr>
		
	</table>
</body>
</html>