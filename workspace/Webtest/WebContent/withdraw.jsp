<%@page import="dao.*" %>
<%@page import="util.ConnectionPool" %>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	
	//DAO 이후 아래 다 지워도 됨
/* 	//1.드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
	//2. DB 연결
		Connection conn = DriverManager.getConnection("jdbc:mysql:://localhost:3306/testdb", "root", "0000");
	
	//Connection conn = ConnecitonPool.get(); (ConnectionPool.java가 완성되면 사실 1, 2번은 이 한줄이면 끝남)
	
	//3.SQL 구문(어제와는 좀 다른 방식으로)
		String sql = "DELETE FROM user WHERE id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid); */
	//4. 결과 받기
		UserDAO dao = new UserDAO();
		int count = dao.delete(uid); //dao작성 이후 필요없음 int count = stmt.executeUpdate();
		if (count == 1) {
			out.print("회원탈퇴가 이루어졌습니다.");
		} else {
			out.print("오류가 발생했습니다.");
		}
		


%>
</body>
</html>