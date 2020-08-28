<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 수정</title>
</head>
<body>
	<div id="nav">
	<%@ include file="../include/nav.jsp" %>
	</div>

	<form method="post">
		<label>제목</label>
		<input type="text" name="title" value="${view.title}"> <br>
		
		<label>글쓴이</label>
		<input type="text" name="writer" value="${view.writer}"> <br>
		
		<label>내용</label>
		<textarea rows="5" cols="50" name="content">${view.content}</textarea><br>
		
		<button type="submit">수정 완료</button>
	</form>

</body>
</html>