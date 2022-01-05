<%@page import="dao.*" %>
<%@page import="util.ConnectionPool" %>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	
	//DAO 작성 이후 요 밑에 다 필요없음
/* 	String sql = "INSERT INTO user(id, password, NAME) VALUES";
	sql += "('" + uid + "','" + ups + "','" + una + "')"; 
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/testdb","root","0000");
	
	Statement stmt = conn.createStatement(); */
	
	UserDAO dao = new UserDAO();
	int count = dao.insert(uid, ups, una); //DAO파일 작성 후 이거 필요 없음 int count = stmt.executeUpdate(sql);
	if(count == 1) {
		out.print("회원 가입 완료");
	} else {
		out.print("오류발생");
	}

%>
