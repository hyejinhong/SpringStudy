<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<%@ include file="./include/cssjs.jsp"%>
</head>
<body>
	<div class="container">
		<div id="nav">
			<%@ include file="./include/nav.jsp"%>
		</div>

	</div>

	<div class="container">

		<c:if test="${member==null}">
			<form method="post" action="/member/login">
				<div class="form-group">
					<div class="row">
						<label class="col-sm-2 control-label">아이디</label>
						<div class="col-sm-5">
							<input class="form-control" type="text" id="userId" name="userId">
						</div>
					</div>
				</div>

				<div>
					<div class="form-group">
						<div class="row">
							<label class="col-sm-2 label-control">비밀번호</label>
							<div class="col-sm-5">
								<input class="form-control" type="password" id="userPw"
									name="userPw">
							</div>
						</div>
					</div>
				</div>

				<button class="btn btn-success" type="submit">로그인</button>
			</form>
		</c:if>

		<c:if test="${msg == false}">
			<div class="alert alert-danger">로그인 정보가 틀립니다.</div>
		</c:if>
	</div>


</body>
</html>
