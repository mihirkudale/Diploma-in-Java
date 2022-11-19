<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a=10;
   out.println(a);
   out.println("Welcome to scriplet tag");


%>


<form action="Two.jsp">
Enter name:<input type="text" name="name"><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>