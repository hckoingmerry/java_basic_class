<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<%@ include file = "_header.jsp"%>
<%
String greeting = "Welcome to Web Shopping Mall";
String tagline = "Welcome to WEMBALL";
%>
<div class="alert alert-secondary" role="alert">
<div class = "container">
	<h1 class = "display-3"> <%= greeting %></h1>
</div>
</div>

<div class = "container">
<div class = "text-center">
	<h3> <%= tagline %></h3>
</div>
</div>

<footer class = "container">
<p>&copy; WebMall by KHC</p>
</footer>

<nav class="navbar fixed-bottom navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">즐겨찾기</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">제품목록</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">장바구니</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<%@ include file = "_footer.jsp"%>
</body>
</html>