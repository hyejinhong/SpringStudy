<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${list.regDate}"/>
						</td>
						<td>${list.writer}</td>
						<td>${list.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="container">
			<ul class="pagination center-block">
				<c:if test="${pagination.prev}">
					<li><a href="/board/list?page=${pagination.startPageNum-1}${pagination.searchTypeKeyword}"><span>&laquo;</span></a>
					</li>
				</c:if>

				<c:forEach begin="${pagination.startPageNum}"
					end="${pagination.endPageNum}" var="page">
					<c:if test="${cur == page}">
						<li class="active"><a href="/board/list?page=${page}${pagination.searchTypeKeyword}">${page}</a></li>
					</c:if>
					<c:if test="${cur != page}">
						<li><a href="/board/list?page=${page}${pagination.searchTypeKeyword}">${page}</a></li>
					</c:if>
				</c:forEach>

				<c:if test="${pagination.next}">
					<li><a href="/board/list?page=${pagination.endPageNum+1}${pagination.searchTypeKeyword}"><span>&raquo;</span></a>
					</li>
				</c:if>

			</ul>
		</div>
		
		<br>
		<div class="row">
			<div class="col-sm-2">
				<select class="col-sm-2 form-control" name="searchType">
					<option value="title" <c:if test="${pagination.searchType eq 'title'}">selected</c:if>>제목</option>
					<option value="content" <c:if test="${pagination.searchType eq 'content'}">selected</c:if>>내용</option>
					<option value="title_content" <c:if test="${pagination.searchType eq 'title_content'}">selected</c:if>>제목+내용</option>
					<option value="writer" <c:if test="${pagination.searchType eq 'writer'}">selected</c:if>>작성자</option>
				</select>
			</div>
			<div class="col-sm-8">
				<input class="col-sm-9 form-control" type="text" name="keyword" value="${pagination.keyword}">
			</div>
				<button class="col-sm-1 btn btn-primary" id="searchBtn" type="button">검색</button>
		</div>
	</div>
</body>

<script type="text/javascript">
	$("#searchBtn").click(function() {
		let searchType = $("select[name=searchType]").val();
		let keyword = $("input[name=keyword]").val();
		
		location.href="/board/list?page=1&searchType="+searchType+"&keyword="+keyword;
	})
</script>
</html>