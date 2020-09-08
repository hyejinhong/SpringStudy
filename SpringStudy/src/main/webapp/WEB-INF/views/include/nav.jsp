<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul class="nav nav-tabs">
	<li>
		<a href="/">
			<span class="glyphicon glyphicon-home"></span> Home
		</a>
	</li>
	
	<li>
		<a href="/board/list?page=1">
			<span class="glyphicon glyphicon-th-list"></span> 게시물 목록
		</a>
	</li>
	
	<li>
		<a href="/board/write">
			<span class="glyphicon glyphicon-pencil"></span> 게시물 작성
		</a>
	</li>
	
	<c:if test="${member == null}">
	<li>
		<a href="/member/register">
			<span class="glyphicon glyphicon-user"></span> 회원가입
		</a>
	</li>
	</c:if>
</ul>

<c:if test="${member != null}">
	<p class="pull-right">
		${member.userName}님 환영합니다~
		<button class="btn btn-warning btn-sm pull-right" onclick="location.href='/member/logout'">로그아웃</button>
	</p>
</c:if>
<br>
