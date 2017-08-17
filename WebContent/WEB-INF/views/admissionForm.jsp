<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
	<h2>${headerMsg}</h2>
	<form:errors path="applicant.*" />
	
	<form action="/FirstMVCTutorial/admissionSubmit" method="post">
		<table>
			<tr>
				<td><label id="nameId">Name:</label> <input type="text"
					name="name" id="nameId" /></td>
			</tr>
			<tr>
				<td><label id="ageId">Age:</label> <input type="text" name="age"
					id="ageId" /></td>
			</tr>
			<tr>
				<td><label id="dateId">Date:</label> <input type="text"
					name="localDate" id="dateId" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>