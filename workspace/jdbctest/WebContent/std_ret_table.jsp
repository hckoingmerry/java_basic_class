<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<% //전송 한글 데이터 처리
	request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 학생 정보 저장</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
<%
//객체 참조 변수
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rset = null;

String driverClass = "org.mariadb.jdbc.Driver"; //드라이버 로딩

try {
	Class.forName(driverClass);
	out.println("JDBC Driver loading 성공!<br>");
} catch (ClassNotFoundException err) {
	out.println("JDBC Driver loading 실패!!...WEB-INF/lib 폴더 확인<br>");
}

//마리아 서버 연결
String url = "jdbc:mariadb://localhost:3306/univ";
String id = "root";
String pw = "0000";

try {
	conn = DriverManager.getConnection(url, id, pw);
	out.println("MariaDB 서버 연결 성공!<br>");
	//SQL 질의어 처리
	//전송 데이터 변수 할당
	
	String sql = "Select * from student order by hakbun ASC";
	pstmt = conn.prepareStatement(sql);
	rset = pstmt.executeQuery();
%>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">학번</th>
      <th scope="col">이름</th>
      <th scope="col">학년</th>
      <th scope="col">학과</th>
      <th scope="col">주소</th>
    </tr>
  </thead>

  <tbody>
      	<%
     	 	//학생 정보 출력
     	 	int no = 1;
    		while (rset.next()) {
    		String hakbun = rset.getString("hakbun");
    		String name = rset.getString("name");
    		String year = rset.getString("year");
    			   year = year + "학년";
    		String dept = rset.getString("dept");
    		String addr = rset.getString("addr");

    	%>
    <tr>
      <th scope="row"><%=no %></th>
      <td><%=hakbun %></td>
      <td><%=name %></td>
      <td><%=year %></td>
      <td><%=dept %></td>
      <td><%=addr %></td>
    </tr>
    	<%
    	no++;
    		}
} catch (SQLException sqlerr) {
	out.println("SQL 질의처리 오류!<br>");
	out.println(sqlerr.getMessage() + "<br>");
} finally {
	//데이터베이스 연결 종료
	if (rset != null) {
		try {
			rset.close();
			out.println("ResultSet_close!<br>");
		} catch (SQLException sqlerr) {}
	}
	if (pstmt != null) {
		try {
			pstmt.close();
			out.println("Statement_close!<br>");
		} catch (SQLException sqlerr) {}
	}
	if (conn != null) {
		try {
			conn.close();
			out.println("MariaDB 서버 연결 종료!<br>");
		} catch (Exception conerr) {}
	}
}
    	%>
</tbody>
</table>
</body>

</html>