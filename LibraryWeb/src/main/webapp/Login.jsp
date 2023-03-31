<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/login.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/6abcb3f637.js" crossorigin="anonymous"></script>
<title>Se connecter</title>
</head>
<body>
	<h1>Connexion</h1>
	<c:if test="${not empty requestScope.USER}">
		<div class="connected">
			<p>Vous êtes déjà connecté sous le profil <span class="bold">${requestScope.USER}</span> !</p>
		  	<a href="books" class="button">Rechercher un livre</a>
	  	</div>
	</c:if>
	<c:if test="${empty requestScope.USER}">
		<form action="login" method="post">
			<table>
				<tr>
					<td><label for="login">Identifiant</label></td>
					<td><input type="text" name="login" id="login" /></td>
				</tr>
				<tr>
					<td><label for="password">Mot de passe</label></td>
					<td><input type="password" name="password" id="password" /></td>
				</tr>
			</table>
			<p class="error">
				<c:if test="${not empty requestScope.ERROR}">
				  	${requestScope.ERROR}
				</c:if>
			</p>
			<button class="button">Connexion</button>
		</form>
	</c:if>
</body>
</html>