<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
</head>
<body>

	<form method="post">
		<label>제목</label>
		<input type="text" name="title"> <br>
		
		<label>글쓴이</label>
		<input type="text" name="writer"> <br>
		
		<label>내용</label>
		<textarea rows="5" cols="50" name="content"></textarea><br>
		
		<button type="submit">작성</button>
	</form>

</body>
</html>