<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!--  isErrorpage : defalut는 false
    isErrorPage를 true로 지정하면 exception 객체를 이용할 수 있게 된다.
    ex) exception.getMessage();
     -->
	<%
		String msg = exception.getMessage();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red">에러발생 : <%=msg %></h1>
</body>
</html>