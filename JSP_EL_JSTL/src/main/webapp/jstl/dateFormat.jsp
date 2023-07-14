<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date today = new Date();
		String todayStr = new SimpleDateFormat("yyyy-MM-dd").format(today);
		out.println("Date 객체 : " + today + "<br>");
		out.println("today : " + todayStr + "<br>");
	%>
	
	<fmt:formatDate var="todayStr" value="<%=new Date() %>" pattern="yyyy-MM-dd" scope="page"/>
	today : ${todayStr }
</body>
</html>