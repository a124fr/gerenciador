<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/altera_empresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário Nova Empresa</title>
</head>
<body>
	<form method="POST" action="${linkServletNovaEmpresa}">
		<input type="hidden" name="id" value="${empresa.id}" />
		
		Nome: <input type="text" name="nome" value="${empresa.nome}" />
		
		Data Abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
		
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>