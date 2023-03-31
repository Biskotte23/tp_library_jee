<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/admin.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/6abcb3f637.js" crossorigin="anonymous"></script>
<title>Administration</title>
</head>
<body>
	<header>
		<c:if test="${empty requestScope.USER}">
		   <a href="login" class="button">Connexion</a>
		</c:if>
		<c:if test="${not empty requestScope.USER}">
		   <p class="connected"><i class="fa-solid fa-user"></i> ${requestScope.USER}</p>
		</c:if>
	</header>
	<h1>Gestion des livres empruntés</h1>
	<table>
		<tr>
			<th>Livre</th>
			<th>Emprunteur</th>
			<th>Rendre</th>
		</tr>
		<c:forEach items="${requestScope.BORROWS}" var="borrow">
			<form action="admin" method="post">
			<input type="hidden" name="id" value="${borrow.id}">
			<tr>
				<td name="title">${borrow.book.title}</td>
				<td name="user">${borrow.user}</td>
				<td><input type="submit" value="Livre rendu" class="button"></td>
			</tr>
			</form>
		</c:forEach>
	</table>
</body>
</html>