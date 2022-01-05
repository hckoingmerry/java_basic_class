<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
</head>
<body>
<%@ include file="/_header.jsp" %>
<div class="alert alert-dark" role="alert">
  회원탈퇴
</div>

<div class="cointaner">
<main class="form-signin">
  <form action="withdrawcheck.jsp">
    <img class="mb-4" src="/docs/5.0/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">회원탈퇴</h1>

    <div class="form-floating">
      <input type="text" name="id" class="form-control" id="floatingInput" placeholder="아이디를 입력하세요.">
      <label for="floatingInput">아이디</label>
    </div>
    <div class="form-floating">
      <input type="password" name="ps" class="form-control" id="floatingPassword" placeholder="암호를 입력하세요.">
      <label for="floatingPassword">암호</label>
    </div>

<!--     <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div> -->
    <button class="w-100 btn btn-lg btn-primary" type="submit">회원탈퇴</button>
    <p class="mt-5 mb-3 text-muted">&copy; by KHC 2017–2021</p>
  </form>
</main>
</div>

<%@ include file="/_footer.jsp" %>

</body>
</html>