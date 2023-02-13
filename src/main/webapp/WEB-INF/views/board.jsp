<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
	</tr>
	<tr>
		<c:forEach items="${list}" var="data">
			<td>{data.boardtitle}</td>
			<td>{data.nickname}</td>
			<td><fmt:formatDate pattern="yyyy/MM/dd" value="${data.createDate}"/></td>
		</c:forEach>
	</tr>
</table>
	
	

</body>
</html>