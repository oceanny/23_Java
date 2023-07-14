<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- java --%>
<%
int i = 123;
if (i > 0) {
	out.println("i는 0보다 큽니다.");
} else {
	out.println("i는 0이거나 0보다 작습니다.");
}
%>
<hr>
<%-- jstl --%>
<%-- c:if는 else가 없으므로 else 사용 필요하면 choose-when-otherwise로 구분해야 함 --%>
<c:set var="i" value="123" />
<c:if test="${i gt 0 }">
 i는 0보다 큽니다.</c:if>
<c:if test="${i lt 0 || i eq 0 }">
i는 0이거나 0보다 작습니다.
</c:if>
<hr>
<%-- set은 있던 변수에 값을 set --%>
<c:set var="i" value="123" />
<c:choose>
	<c:when test="${i get 0 }">i는 0보다 큽니다.</c:when>
	<c:otherwise>i는 0이거나 0보다 작습니다.</c:otherwise>
</c:choose>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

