<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário Nova Empresa</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>
	
	<form method="POST" action="${linkEntradaServlet}">
		<input type="hidden" name="acao" value="AlteraEmpresa" />
		<input type="hidden" name="id" value="${empresa.id}" />
		
		Nome: <input type="text" name="nome" value="${empresa.nome}" />
		
		Data Abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
		
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>