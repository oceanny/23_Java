<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		int data = 100000000;
		String price = new DecimalFormat("#,###").format(data);
		out.println("가격 : ￦" + price + "<br>");
	%>

	<fmt:formatNumber var="price" value="100000000" pattern="#,###" scope="page" />
	가격 : ￦${price }
</body>
</html>