<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

 <nav class="navbar navbar-expand-lg navbar-light bg-light rounded" aria-label="Twelfth navbar example">
      <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample10" aria-controls="navbarsExample10" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample10">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/">마이메모</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">삭제메모</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown" aria-expanded="false">회원관리</a>
              <ul class="dropdown-menu" aria-labelledby="dropdown10">
                <li><a class="dropdown-item" href="/membership/join.jsp">회원가입</a></li>
                <li><a class="dropdown-item" href="/membership/withdraw.jsp">회원탈퇴</a></li>
                <li><a class="dropdown-item" href="/membership/login.jsp">로그인</a></li>
                <li><a class="dropdown-item" href="/membership/logout.jsp">로그아웃</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>