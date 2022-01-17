<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 테이블 스키마 생성</title>
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
	//대학데이터베이스 생성
} catch (SQLException sqlerr) {
	out.println("MariaDB 서버 연결 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
}

try {
	String sql = "CREATE Table student("
						+ "hakbun	int		not	null,"
						+ "name		char(5),"
						+ "year		tinyint,"
						+ "dept		varchar(10),"
						+ "addr		varchar(50),"
						+ "primary key(hakbun))";
	pstmt = conn.prepareStatement(sql);
	pstmt.executeUpdate();
	out.println("학생 테이블 생성 성공!<br>");
} catch (SQLException sqlerr) {
	out.println("학생 테이블 생성 실패!<br>");
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
</body>

</html>