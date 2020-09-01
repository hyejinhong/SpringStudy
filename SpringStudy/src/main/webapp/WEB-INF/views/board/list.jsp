<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>

<%@ include file="../include/cssjs.jsp"%>
</head>
<body>

	<div class="container" id="nav">
		<%@ include file="../include/nav.jsp"%>
	</div>

	<div class="container">
		<table class="table table-hover">
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
						<td><a href="/board/view?id=${list.id}">${list.title}</a></td>
						<td>${list.regDate}</td>
						<td>${list.writer}</td>
						<td>${list.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="container">
			<ul class="pagination center-block">
				<c:if test="${pagination.prev}">
					<li><a href="/board/list?page=${pagination.startPageNum-1}"><span>&laquo;</span></a>
					</li>
				</c:if>

				<c:forEach begin="${pagination.startPageNum}"
					end="${pagination.endPageNum}" var="page">
					<c:if test="${cur == page}">
						<li class="active"><a href="/board/list?page=${page}">${page}</a></li>
					</c:if>
					<c:if test="${cur != page}">
						<li><a href="/board/list?page=${page}">${page}</a></li>
					</c:if>
				</c:forEach>

				<c:if test="${pagination.next}">
					<li><a href="/board/list?page=${pagination.endPageNum+1}"><span>&raquo;</span></a>
					</li>
				</c:if>

			</ul>
		</div>
	</div>
</body>
</html>