<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/nova_empresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário Nova Empresa</title>
</head>
<body>
	<form method="POST" action="${linkServletNovaEmpresa}">
		Nome: <input type="text" name="nome" />
		
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>