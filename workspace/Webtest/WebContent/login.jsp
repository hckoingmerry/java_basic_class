<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.*" %>
<%@page import="util.ConnectionPool" %>
    
<%-- JSP 스크립팅 요소 5가지 --%>
<%--
<% ........ %> 스크립틀릿(scriptlet) 일반 자바 코드 삽입
<%@ ........ %> 지시어(directive)
	- 페이지 처리를 위해 부가적인 정보를 처리하는 데에 이용
<%= ........ %> 표현식(expression)
<%! ........ %> 선언문(declaration)
 주석(comment) --%>
 
 <%--
 지시어(directive): 페이지 처리를 위해 부가적인 정보를 처리하는 데에 이용
 			page: jsp처리 방법을 정의
 			include: 다른 문서를 포함(header, footer)
 			taglib: 태그라이브러리 설정 JTSL - JSP Standard Tag Library
  --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%@ include file="_header.jsp" %>
<!-- include 지시어를 사용할 때 주의할 점은 두 파일간에 이름이 같은 변수가 있으면 안된다. 일반 자바에서와 같이 충돌하게 될 것 -->

<%-- DAO 이후 각주 처리
<h3>User ID : <%=request.getParameter("id") %></h3>
<h3>User PW : <%=request.getParameter("ps") %></h3>
 <!-- <h6>현재 시간은 (new Date()).toString() %>입니다.</h6> -->
 --%>

<%
String uid = request.getParameter("id");
String ups = request.getParameter("ps");

UserDAO md = new UserDAO();
int result = md.login(uid, ups);
if (result ==1)
	out.print("아이디가 존재하지 않습니다.");
else if (result == 2)
	out.print("비밀번호가 일치하지 않습니다");
else
	session.setAttribute("id", "uid");
	response.sendRedirect("main.jsp");
%>

</body>

</html>