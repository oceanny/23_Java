<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	int sum = 0;
	for (int i = 1; i < 11; i++){
		sum += i;
	}
	out.println("1부터 10까지 더한 값 : " + sum + "<br>");
%>
<c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="10">
	<c:set var="sum" value="${sum + i }"/>
</c:forEach>
1부터 10까지 더한 값 : ${sum }<br>
<hr>
<%
	for (int dan = 2; dan < 10; dan++){
		out.println(dan + "단 입니다.<br>");
		for (int gop = 1; gop < 10; gop++){
			out.println(dan + " * " + gop + " = " + dan * gop + "<br>");
		}
		out.println("<br>");
	}
%>
<%-- c:은 pageContext에 값을 저장 -> EL문 이용 가능 --%>
<c:forEach var="dan" begin="2" end="9">
	${dan }단 입니다.<br>
	<c:forEach var="gop" begin="1" end="9">
		${dan } * ${gop } = ${dan * gop }<br>
	</c:forEach>
	<br>
</c:forEach>
<hr>
<%
	List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("1");
	list.add("2");
	list.add("3");
	
	for (String one : list){
		out.println(one + "<br>");
	}
%>
<c:set var="list" value="<%=list %>"/>
<c:forEach var="one" items="${list }" varStatus="status">
	${status.count}번째${one }<br>
</c:forEach>
<hr>
<c:forEach var="i" begin="21" end="30" varStatus="status">
	반복회수 : ${status.count }, 인덱스 : ${status.index }<br>
</c:forEach>
<hr>