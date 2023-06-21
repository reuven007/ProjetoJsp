<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Formulario JSP</h1>

	<form action="ServletLogin" method="post">

		<table>
			<tr>
				<td><label>Login</label></td>
				<td><input name="login" type="text" pattern="[A-Za-z]+">
				</td>


			</tr>
			<tr>
				<td><label>Senha</label></td>
				<td><input name="senha" type="password"></td>


			</tr>

		</table>

		<input type="submit" value="Enviar">


	</form>
	
	<h4> ${msgm}</h4>

</body>
</html>