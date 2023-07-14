<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	String data = "a,b,c,d,e,f,g";
	StringTokenizer token = new StringTokenizer(data, ",");
	while(token.hasMoreElements()){
		out.println(token.nextElement() + "<br>");
	}
%>

<c:set var="data" value="<%=data %>" />
<c:forTokens var="token" items="${data }" delims=",">
	${token }<br>
</c:forTokens>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>