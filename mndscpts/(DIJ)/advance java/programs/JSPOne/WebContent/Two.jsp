<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<%! int a=10;
int b=20;
int c;


public int cube(int a)
{
	return a*a*a;
}

public int add(int c,int d)
{
	return a+b;
}

%>



<%= c=a+b %>
<br><br>
<%= cube(3) %>
<br><br>
<%= add(50,50) %>
 
 

<%
String n=request.getParameter("name");
out.println(n);
%>
</center>
</body>
</html>