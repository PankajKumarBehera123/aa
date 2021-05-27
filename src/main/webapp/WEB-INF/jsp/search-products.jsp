<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Products</title>
</head>
<body>
	<h2 style="color: red;">Search for interested products..</h2>
	<form
		action="${pageContext.request.contextPath }/show-searched-products.htm">
		Enter Product Name : <input type="text" name="productName" /> <br>
		<input type="submit" value="search">
	</form>
</body>
</html>