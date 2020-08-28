<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>
	The time on the server is ${serverTime}.
	${testString} 
</P>

<P>
	<div id="nav">
	<%@ include file="./include/nav.jsp" %>
	</div>

</P>

</body>
</html>
