<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<pre>


  
</pre>
<h1 class = "text-center">CADASTRO DE AUTOR </h1>
<body class= container>
<style>
body{
background-color:#84ceff
}

margin
</style>
	<form action= "<c:url value ="/formulario"/>" method = "POST">
		<div class = "form-group">
			<label>Nome</label>
			<input type = "text" class= "form-control" name = "nome" required>
		</div>
			<div class = "form-group">
			<label>Email</label>
			<input type = "email" class= "form-control" name = "email" required>
		</div>
			<div class = "form-group">
			<label>Data de Nascimento</label>
			<input type = "date" class= "form-control" name = "data" required>
		</div>
			<div class = "form-group">
			<label>Sobre o autor</label>
			<input type = "text" class= "form-control" name = "sobre" required>
		</div>
		<input type= submit value= "Gravar" class = mt-3>
	</form> 
	<h1 class = "text-center">LISTA DE AUTORES</h1>
	<table class= "table table-hover table-striped table bordered table-dark">
	
			<tr>
				<th>NOME</th>
				<th>EMAIL</th>
				<th>DATA</th>
				
			</tr> 
		
		<tbody>	
		<c:forEach items= "${autores}" var= "a">
			<tr>
				<td>${a.nome}</td>
				<td>${a.email}</td>	
				<td>${a.dataNascimento}</td>	
				
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</body>
</html>