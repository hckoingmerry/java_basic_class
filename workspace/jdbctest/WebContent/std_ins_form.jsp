<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% //전송 한글 데이터 처리
	request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 정보 입력</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<body>
<div align = "center">
<h2>학생 정보 입력</h2>
</div>

<form action = "std_ins_db.jsp" method = "post" class="row g-3">
  <div class="col-12">
    <label for="inputEmail4" class="form-label">학번</label>
    <input type="text" name ="hakbun" class="form-control" id="inputEmail4">
  </div>
  <div class="col-12">
    <label for="inputPassword4" class="form-label">이름</label>
    <input type="text" name ="name" class="form-control" id="inputPassword4">
  </div>
  <div class="col-12">
    <label for="inputAddress" class="form-label">학년</label><br>
  		<input class="form-check-input" type="radio" name="year" id="inlineRadio1" value="1">
  		<label class="form-check-label" for="inlineRadio1">1학년</label>
  		<input class="form-check-input" type="radio" name="year" id="inlineRadio2" value="2">
  		<label class="form-check-label" for="inlineRadio2">2학년</label>
  		<input class="form-check-input" type="radio" name="year" id="inlineRadio3" value="3">
  		<label class="form-check-label" for="inlineRadio3">3학년</label>
  		<input class="form-check-input" type="radio" name="year" id="inlineRadio4" value="4">
  		<label class="form-check-label" for="inlineRadio4">4학년</label>
 </div>

  <div class="col-12"><br>
    <label for="inputAddress2" class="form-label">학과</label>
    <input type="text" class="form-control" name="dept" id="inputAddress2">
  </div>
  <div class="col-12">
    <label for="inputAddress3" class="form-label">주소</label>
    <input type="text" class="form-control" name="addr" id="inputAddress3">
  </div>
 <div align = "center">
  <div class="col-12">
    <input type="submit" class="btn btn-primary" value="전송">
  </div>
  </div>
</form>

</body>
</html>