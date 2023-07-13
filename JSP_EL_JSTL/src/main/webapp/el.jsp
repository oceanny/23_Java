<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
pageContext.setAttribute("pageData", "el.jsp"); 
pageContext.setAttribute("servlet_request", "el.jsp"); 
pageContext.setAttribute("servlet_session", "el.jsp"); 
pageContext.setAttribute("servlet_application", "el.jsp"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>pageContext: ${pageData}</h1>
<h1>request : ${requestScope.servlet_request}</h1>
<h1>session : ${sessionScope.servlet_session}</h1>
<h1>application : ${applicationScope.servlet_application}</h1>
</body>
</html>
