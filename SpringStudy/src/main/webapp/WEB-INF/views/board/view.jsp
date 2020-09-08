<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물 조회</title>

<%@ include file="../include/cssjs.jsp"%>
</head>
<body>
	<div class="container" id="nav">
		<%@ include file="../include/nav.jsp"%>
	</div>

	<div class="container">
		<br>
		<div class="row">
			<label class="col-sm-2 control-label">제목</label>
			<div class="col-sm-7">
				${view.title}<br>
			</div>
			<label class="col-sm-2">조회수</label>
			<div class="col-sm-1">${view.hit}</div>
		</div>

		<div class="row">
			<label class="col-sm-2 control-label">작성일</label>
			<div class="col-sm-10"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${view.regDate}"/></div>
		</div>
		
		<div class="row">
			<label class="col-sm-2 control-label">글쓴이</label>
			<div class="col-sm-10">${view.writer}</div>
		</div>

		<div class="row">

			<label class="col-sm-2 control-label">내용</label>
			<div class="col-sm-10 panel panel-default">
				<div class="panel-body">
					${view.content} <br>
				</div>
			</div>
		</div>

		<c:if test="${member.userId == view.writer}">
			<button class="btn btn-sm btn-danger pull-right" id="deleteBtn">
				<span class="glyphicon glyphicon-trash"></span> 삭제
			</button>
	
			<button class="btn btn-sm btn-success pull-right" id="modifyBtn">
				<span class="glyphicon glyphicon-pencil"></span> 수정
			</button><br>
		</c:if>
		<hr>
		<h4>댓글</h4>

		<div>
			<form method="post" action="/board/writeReply">
				<input type="hidden" id="id" name="id" value="${view.id}" readonly="readonly">
				<input type="hidden" id="writer" name="writer" value="${member.userId}" readonly="readonly">
							
				<div class="col-sm-10 form-group">
					<textarea class="form-control" id="content" rows=2 name="content"></textarea>
				</div>
				<div class="col-sm-2">
					<button class="btn btn-block btn-primary btn-lg" type="submit">작성</button>
				</div>
			</form>
		</div>
		
		
		<table class="table">
			<thead>
				<tr>
					<th class="col-sm-2">작성자</th>
					<th class="col-sm-7">내용</th>
					<th class="col-sm-2">작성일</th>
					<th class="col-sm-1"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${replyList}" var="reply">
					<tr>
						<td>${reply.writer}</td>
						<td>${reply.content}</td>
						<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${reply.regDate}"/></td>
						<td>
							<c:if test="${member.userId == reply.writer}">
								<a href="#"><span class="glyphicon glyphicon-pencil"></span></a>
								<a href="#"><span class="glyphicon glyphicon-remove"></span></a>
							</c:if>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>

<script>
	$("#modifyBtn").click(function() {
		location.href = "modify?id=" + ${view.id};
	});

	$("#deleteBtn").click(function() {
		location.href = "delete?id=" + ${view.id};
	});
</script>
</html>