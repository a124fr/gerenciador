<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário Nova Empresa</title>
</head>
<body>
	<form method="POST" action="${linkEntradaServlet}">
		<input type="hidden" name="acao" value="NovaEmpresa" />
		Nome: <input type="text" name="nome" />
		
		Data Abertura: <input type="text" name="dataAbertura" />
		
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>