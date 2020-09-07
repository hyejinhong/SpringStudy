<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<%@ include file="../include/cssjs.jsp"%>
</head>
<body>

	<div class="container" id="nav">
		<%@ include file="../include/nav.jsp"%>
	</div>

	<div class="container">
		<form method="post" onsubmit="return checkEmpty();">
			<div class="form-group">
				<label class="col-sm-2 control-label">아이디</label>
				<div class="col-sm-10">
					<input class="form-control" type="text" id="userId" name="userId"> <br>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">비밀번호</label>
				<div class="col-sm-10">
					<input class="form-control" type="password" id="userPw"
						name="userPw"> <br>
				</div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">닉네임</label>
				<div class="col-sm-10">
					<input class="form-control" type="text" id="userName"
						name="userName"> <br>
				</div>
			</div>

			<button class="btn btn-success pull-right" id="submitBtn" type="submit">가입</button>
			
		</form>
	</div>
</body>

<script type="text/javascript">

	function checkEmpty() {
		let check1 = $("input[name=userId]").val() == "" ? true : false;
		let check2 = $("input[name=userPw]").val() == "" ? true : false;
		let check3 = $("input[name=userName]").val() == "" ? true : false;
		
		// 하나라도 true이면 가입 못함
		if(check1 || check2 || check3) {
			alert("필수사항을 모두 입력해주세요.");
			return false;
		}
		return true;
	}
</script>
</html>