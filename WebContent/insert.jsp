<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.demo.service.*, com.demo.model.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="service" class="com.demo.service.ProductService" />
<jsp:useBean id="product" class="com.demo.model.Product" />
<jsp:setProperty property="*" name="product"/>
<% 
	
	int num = service.insert(product);
	response.sendRedirect("index.jsp");
%>	
</body>
</html>