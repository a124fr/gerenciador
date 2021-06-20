<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Empresas</title>
</head>
<body>
<h1>Lista de Empresas</h1>

	<ul>
	<% 
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");		
		for(Empresa e : lista) {
	%>
		<%="<li>" + e.getNome() + "</li>" %>
	<%
		}
	%>
	</ul>
</body>
</html>