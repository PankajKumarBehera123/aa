<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Searched Products</title>
</head>
<body>
	<h3>Matched Results!</h3>
	<c:forEach items="${products}" var="product">
		product name : ${product.productName} & description : ${product.description} &  price : ${product.price } <br>
	</c:forEach>

</body>
</html>