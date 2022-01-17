<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="dbconnclose.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰데이터베이스 테이블 생성</title>
</head>

<body>
<%
//객체 참조 변수
Connection conn = null;
PreparedStatement pstmt = null;

conn = DbConnClose.getConnection(); //드라이버 로딩 & 마리아 서버 연결


try {
	String sql = "CREATE Table customer("
						+ "cust_id			varchar(10)		not	null,"
						+ "cust_pw			varchar(10),"
						+ "cust_name		varchar(15),"
						+ "cust_tel_no		varchar(13),"
						+ "cust_addr		varchar(100),"
						+ "cust_gender		char(1),"
						+ "cust_email		varchar(30),"
						+ "cust_join_date	date,"
						+ "primary key(cust_id))";
	pstmt = conn.prepareStatement(sql);
	pstmt.executeUpdate();
	out.println("고객테이블 생성 성공!<br>");
} catch (SQLException sqlerr) {
	out.println("SQL 질의처리 오류!<br>");
	out.println(sqlerr.getMessage() + "<br>");
} finally {
	//데이터베이스 연결 종료
	DbConnClose.resourceClose(pstmt, conn);
}
%>
</body>

</html>