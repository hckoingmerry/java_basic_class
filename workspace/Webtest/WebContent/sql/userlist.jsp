<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
/*
1. JDBC 드라이버 로딩
2. DB 접속을 위한 Connection 객체 생성
3. SQL 명령문을 전달하기 위한 Statement 객체 생성
4. Statement객체를 이용하여 쿼리 실행
5. DB로부터 전송된 쿼리 실행결과 처리
6. 사용된 객체 닫기
*/

//드라이버 로딩
Class.forName("com.mysql.jdbc.Driver");
//객체생성
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "0000");
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM user"); //user 테이블로부터 모든 것(*)
String str = "";
while (rs.next()) {
	str += rs.getString("no") + "," + rs.getString("id") + "," + rs.getString("password") + "," + rs.getString("name") + "," + rs.getString("ts") + "<br><hr>";
}
out.print(str);
%>

</body>
</html>