<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물 목록</title>
</head>
<body>
	
	<table>
		<thead>
			<tr>글번호</tr>
			<tr>제목</tr>
			<tr>작성일</tr>
			<tr>글쓴이</tr>
			<tr>조회수</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.id}</td>
					<td>${list.title}</td>
					<td>${list.regDate}</td>
					<td>${list.writer}</td>
					<td>${list.hit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>