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
	 String nome =  request.getParameter("nome");
	out.println("Nome do cliente: " + nome);

	
	String idade =  request.getParameter("idade");
		out.println("Idade do cliente: " + idade);


		String email =  request.getParameter("email");
			out.print("Email do cliente: " + email);
	%>
	
	
	
</body>
</html>

