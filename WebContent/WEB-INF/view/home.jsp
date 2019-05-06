<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form:form action="insertuser" method="post" modelAttribute="cust">

		<form:hidden path="id" />
		<form:input path="name" required="required"/>
		<form:input path="prod" required="required"/>
		<input type="submit" value="submit">
</form:form>
</body>
</html>