<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	width: ${width}px;
	height: ${height}px;
	margin: ${margin_top}px ${margin_right}px ${margin_bottom}px ${margin_left}px;
	padding: ${padding_top}px ${padding_right}px ${padding_bottom}px ${padding_left}px;
	
	background-color: #fcaeae;
	font-size: 36pt;
}
</style>
</head>
<body>
	<div id="rectangle">${content}</div>
</body>
</html>