<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard TagLib</title>
</head>
<body>
	<c:import url="logout-parcial.jsp"/>

	Usuário Logado: ${usuarioLogado.login}
	
	<br/>

	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} cadastrada com sucesso!</p>
	</c:if>
	
	
	<h1>Lista de Empresas</h1>
	
	<a href="${linkEntradaServlet}?acao=NovaEmpresaForm">nova empresa</a>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome}- <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
				<a href="${linkEntradaServlet}?acao=MostraEmpresa&id=${empresa.id}">editar</a>
				<a href="${linkEntradaServlet}?acao=RemoveEmpresa&id=${empresa.id}">remove</a>	
			</li>
		</c:forEach>
	</ul>

</body>
</html>