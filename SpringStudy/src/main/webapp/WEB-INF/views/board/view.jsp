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
			<div class="col-sm-1">
			${view.hit}
			</div>
		</div>

		<div class="row">
			<label class="col-sm-2 control-label">글쓴이</label>
			<div class="col-sm-10">${view.writer}</div>
		</div>

		<div class="row">

			<label class="col-sm-2 control-label">내용</label>
			<div class="col-sm-10">
				${view.content } <br>
			</div>
		</div>
		
		<button class="btn btn-sm btn-danger pull-right" id="deleteBtn">
			<span class="glyphicon glyphicon-trash"></span> 삭제
		</button>

		<button class="btn btn-sm btn-success pull-right" id="modifyBtn">
			<span class="glyphicon glyphicon-pencil"></span> 수정
		</button>


	</div>
</body>

<script>

	$("#modifyBtn").click(function() {
		location.href="modify?id="+${view.id};
	});
	
	$("#deleteBtn").click(function() {
		location.href="delete?id="+${view.id};
	});

	
</script>
</html>