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
</head>

<body>
<%
//객체 참조 변수
Connection conn = null;
PreparedStatement pstmt = null;

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
	String hakbun = request.getParameter("hakbun");
	String name = request.getParameter("name");
	String year = request.getParameter("year");
	String dept = request.getParameter("dept");
	String addr = request.getParameter("addr");
	
	String sql = "insert into student values(?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.setString(2, name);
		pstmt.setString(3, year);
		pstmt.setString(4, dept);
		pstmt.setString(5, addr);
	pstmt.executeUpdate();
	out.println("학생 테이블 튜플 삽입 성공!<br>");
} catch (SQLException sqlerr) {
	out.println("학생 테이블 튜플 삽입 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
} finally {
	//데이터베이스 연결 종료
	if (pstmt != null) {
		try {
			pstmt.close();
			out.println("Statement_close!<br>");
		} catch (SQLException sqlerr) {
		}
	}
	if (conn != null) {
		try {
			conn.close();
			out.println("MariaDB 서버 연결 종료!<br>");
		} catch (Exception conerr) {}
	}
}
%>

<a href ="./std_ins_form.jsp"></a>
</body>

</html>