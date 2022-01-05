<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.MemberDAO" %>

    
<%
	request.setCharacterEncoding("utf-8");
	
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	String uem = request.getParameter("email");
	String uge = request.getParameter("gender");
	
	MemberDAO dao = new MemberDAO();
	
	if (dao.exist(uid)) {
		response.sendRedirect("/membership/join.jsp");
	}
	if (dao.insert(uid, ups, una, uem, uge)) {
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	}

%>