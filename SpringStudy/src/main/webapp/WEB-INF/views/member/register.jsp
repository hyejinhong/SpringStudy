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
			<div class="row">
				<div class="form-group">
					<label class="col-sm-2 control-label">아이디</label>
					<div class="col-sm-8">
						<input class="form-control" type="text" id="userId" name="userId">
						<br>
					</div>
					<div class="col-sm-2">
						<button type="button" class="btn btn-primary" id="idCheckBtn">중복 확인</button>
					</div>
				</div>
			</div>
			
			<div id="checkResult" class="alert alert-warning">
				아이디 확인이 필요합니다.
			</div>

			<div class="row">
				<div class="form-group">
					<label class="col-sm-2 control-label">비밀번호</label>
					<div class="col-sm-10">
						<input class="form-control" type="password" id="userPw"
							name="userPw"> <br>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group">
					<label class="col-sm-2 control-label">닉네임</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" id="userName"
							name="userName"> <br>
					</div>
				</div>
			</div>

			<button class="btn btn-success pull-right" id="submitBtn"
				type="submit" disabled="disabled">가입</button>

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
	
	// 아이디 중복검사
	$("#idCheckBtn").click(function() {
		let body = {
			userId: $("input[name=userId]").val()	
		};

		$.ajax({
			url: "/member/idCheck",
			type: "post",
			data: body,
			success: function(data) {
				console.log("ㅎㅇ", data);
				if(data) {
					$("#checkResult").addClass("alert-success");
					$("#checkResult").removeClass("alert-warning");
					$("#checkResult").text("사용가능한 아이디입니다.");
					$("#submitBtn").removeAttr("disabled");
				}
				else {
					$("#checkResult").removeClass("alert-success");
					$("#checkResult").addClass("alert-danger");
					$("#checkResult").text("이미 사용중인 아이디입니다.");
				}
			}
		});
	});
	
	// 아이디 값 변경되면 중복검사 다시 필요
	$("input[name=userId]").change(function() {
		$("#checkResult").removeClass("alert-success");
		$("#checkResult").removeClass("alert-danger");
		$("#checkResult").addClass("alert-warning");
		$("#checkResult").text("아이디 확인이 필요합니다.");
		$("#submitBtn").attr("disabled", "disabled");
	});

</script>
</html>