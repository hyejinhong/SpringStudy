<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
<%@ include file="../include/cssjs.jsp"%>
</head>
<body>
	<div class="container" id="nav">
		<%@ include file="../include/nav.jsp"%>
	</div>

	<div class="container">
		<form method="post">

			<div class="form-group">
				<label class="col-sm-2 control-label">제목</label>
				<div class="col-sm-10">
					<input class="form-control" type="text" name="title"> <br>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">글쓴이</label>
				<div class="col-sm-10">
					<input class="form-control" type="text" name="writer"> <br>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col-sm-10">
					<textarea class="form-control" rows="5" cols="50" name="content"></textarea>
					<br>
				</div>
			</div>

			<button class="btn btn-success pull-right" type="submit">작성</button>
		</form>
	</div>
</body>
</html>