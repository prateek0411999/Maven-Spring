<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.io.*"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h1>This is home page</h1>
	<h5>Called by HomeController when /home is fired</h5>
<!-- 
	toh apne se jesa javaee m pda tha scripted tag laga k java uske krlege yha object get 
	krne k liye using HttpServletRequest k request.getAttribute method passing the key that we've assigned there -->
 <!-- 
 typecasting bhi krni padegi jesa deta bheja hoga appan ne
 -->
<%-- <%
	String name=(String) request.getAttribute("name");
	Integer id= (Integer) request.getAttribute("id");
	//getting the list

	List<String> lss = (List<String>) request.getAttribute("ls");
	
	%> --%>
	
<%-- <h2 style="color: RED">My Id is <%= id %> Name is: <%=name %></h2>
 --%>	
 
 <h2 style="color: RED">My Id is ${id}  Name is: ${name} </h2>
	

<%-- <%
	for(String s: lss)
	{
		%>
		<h1><%=s %></h1>
	<% 
	}
	%> --%>
	<hr>
<h4>	${ls} </h4>
	
	<c:forEach var="item" items="${ls }">
		<h2>${item }</h2>
	</c:forEach>
	
</body>
</html>