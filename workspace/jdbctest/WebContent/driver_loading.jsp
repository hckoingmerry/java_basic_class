<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC 드라이버 로딩(driver_loading.jsp)</title>
</head>

<body>
<%
String driverClass = "org.mariadb.jdbc.Driver";

try {
	Class.forName(driverClass);
	out.println("JDBC Driver loading 성공!<br>");
} catch (ClassNotFoundException err) {
	out.println("JDBC Driver loading 실패!!...WEB-INF/lib 폴더 확인<br>");
}

try {
	Connection conn = DriverManager.getConnection("url", "id", "pw");
} catch (SQLException sqlerr) {
	//지정한 url, id, pw가 맞지 않을 경우 오류 발생
}
//마리아 서버 연결
String url = "jdbc:mariadb://localhost:3306/";
String id = "root";
String pw = "0000";
Connection conn = null;

try {
	conn = DriverManager.getConnection(url, id, pw);
	out.println("MariaDB 서버 연결 성공!<br>");
} catch (SQLException sqlerr) {
	out.println("MariaDB 서버 연결 실패!<br>");
	out.println(sqlerr.getMessage() + "<br>");
} finally {
	//데이터베이스 연결 종료
	if (conn != null) {
		try {
			conn.close();
			out.println("MariaDB 서버 연결 종료!<br>");
		} catch (Exception conerr) {
			conerr.printStackTrace();
		}
	}
}
%>
</body>

</html>