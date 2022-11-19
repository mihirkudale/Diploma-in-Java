<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="red">Welcome</font></h1>

<%= 5*5 %>
<br><br>
<%= "Welcome to jsp" %>


<%= Calendar.getInstance().getTime() %>
</body>
</html>