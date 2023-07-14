<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 성공했습니다.
	<ul>
		<%-- parameterMap에서 검색 --%>
		<li>아이디 : ${loginUser.stuNum }</li>
		<li>이름: ${loginUser.name}</li>
	</ul>
</body>
</html>