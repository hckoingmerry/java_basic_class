<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 목록 보기</title>
    <!-- Bootstrap core CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<%@ include file="_header.jsp" %>

<% 
	String uid = (String) session.getAttribute("id");
	if (uid == null) {
		out.print("로그인 정보가 없습니다.");
		response.sendRedirect("login.jsp");
	}
%>

<div class="alert alert-primary" role="alert">
  메인페이지
</div>

<%@ include file="_footer.jsp" %>
</body>
</html>