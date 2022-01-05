<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="util.ConnectionPool" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 메모</title>
</head>

<body>

<%@ include file="_header.jsp" %>

<%
	String uid = (String) session.getAttribute("id");
	if (uid == null) {
		response.sendRedirect("/membership/login.jsp");
	}
	session.setAttribute("id", uid); //안 해도 되긴 한데, 관례적으로 이렇게 다시 재확인시켜줌
%>

<%-- <%
String str = "<table align=center>";
str += "<tr height=40><td><b>작성글 리스트</b></td>";
str += "<td align=right>";
str += "<a href='feedAdd.html'><button>글쓰기</button></a>";
str += "</td></tr>";
out.print(str);
%> --%>

<div class = "container">
<form action="/memo/memocheck.jsp">
<div class="form-floating">
  <textarea class="form-control" name="memo" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
  <label for="floatingTextarea2">메모</label>
</div>
<button class="w-100 btn btn-lg btn-primary" type="submit">완료</button>
</form>

<table align=center>
<%
	Connection conn = ConnectionPool.get();
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT * FROM memo");
	
	while (rs.next()) {
%>
<tr><td colspan=2><hr></td></tr>
<tr><td><%=rs.getString("no") %></td>
	<td><small><%=rs.getString("ts") %></small></td></tr>
<tr><td colspan=2><%=rs.getString("memo") %></td></tr>
<%
	}
 %>
</table>
	
</div>

<%@ include file="_footer.jsp" %>

</body>

</html>