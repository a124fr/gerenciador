<%
	String nomeEmpresa = String.valueOf(request.getAttribute("empresa"));
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		<p>Empresa  <%= nomeEmpresa  %>  cadastrada com sucesso!</p>
	</body>
</html>