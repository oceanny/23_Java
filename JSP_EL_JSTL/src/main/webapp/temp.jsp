<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<% 
pageContext.setAttribute("pageData", "temp.jsp");
String requestData = (String)request.getAttribute("servlet.request");
String sessionData = (String)session.getAttribute("servlet.session");
String applicationData = (String)application.getAttribute("servlet.application");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>pageContext: <%= pageContext.getAttribute("pageData") %></h1>
<h1>request : <%= requestData %></h1>
<h1>session : <%= sessionData %></h1>
<h1>application : <%= applicationData %></h1>
</body>
</html>