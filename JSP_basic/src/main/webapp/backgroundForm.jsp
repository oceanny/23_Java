<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	String color = (String)request.getAttribute("color");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: <%out.println(color != null ? color : "white");%>
}
</style>
</head>
<body>
	<form action="background/css" method="post">
		<select name="color">
			<option value="white">선택하세요.</option>
			<option value="red">빨강</option>
			<option value="orange">주황</option>
			<option value="green">초록</option>
			<option value="blue">파랑</option>
			<option value="black">검정</option>
		</select> <input type="submit" value="전송" />
	</form>
</body>
</html>