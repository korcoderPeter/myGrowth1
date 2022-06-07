<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	crossorigin="anonymous"></script>
</head>
<body>


<c:forEach var="sns" items="${snsList.content }">


<a href="/snsDetail/${sns.id }"><h6>제 목 : ${sns.title } / 아이디 : ${sns.userName } </h6></a>



</c:forEach>
<br>
<a href="/snswrite">글쓰기</a>




</body>
</html>