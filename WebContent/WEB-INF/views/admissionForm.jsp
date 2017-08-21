<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
				<td><spring:message code="label.nameId" /><input type="text"
					name="name" id="nameId" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.ageId" /><input type="text"
					name="age" id="ageId" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.dateId" /> <input type="text"
					name="localDate" id="dateId" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.cityId" /> <input type="text"
					name="address.city" id="cityId" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.countryId" /> <input
					type="text" name="address.country" id="countryId" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
