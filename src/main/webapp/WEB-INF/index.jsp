<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hopper's Receipt</title>
</head>
<body>
<h1>Hopper's Receipt</h1>
<h2>Customer Name: <c:out value="${customerName}"></c:out></h2>
<p>Item name:  <c:out value="${product}"></c:out></p>
<p>Price: $<c:out value="${itemPrice}"></c:out></p>
<p>Description:  <c:out value="${productDescription}"></c:out></p>
<p>Vendor:  <c:out value="${vendorName}"></c:out></p>
</body>
</html>