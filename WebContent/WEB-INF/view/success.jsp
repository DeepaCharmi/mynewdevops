<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,com.demo.stm.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div
{
   border:4px solid green;
   background-color:pink;
   padding:20px;
   cellspacing:30px;
   cellpadding:30px;
   width:100%;
}
</style>
</head>
<body>
	<%
		List<Customer> customers = (List<Customer>) request.getAttribute("customers");
	%>
	<h1>Here is a list</h1>
	<table border="1">
		<thead>
			<th>Name</th>
			<th>Product</th>
			
		</thead>
		<%
			for (Customer temp : customers) {
		%>
		<tr>
			<td><%=temp.getId() %></td>
			<td><%=temp.getName() %></td>
			<td><%=temp.getProd() %></td>
			
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>