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
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>글쓴이</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.id}</td>
					<td>
						<a href="/board/view?id=${list.id}">${list.title}</a>
					</td>
					<td>${list.regDate}</td>
					<td>${list.writer}</td>
					<td>${list.hit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>