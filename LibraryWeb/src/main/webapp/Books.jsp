<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/books.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/6abcb3f637.js" crossorigin="anonymous"></script>
<title>Bibliothèque</title>
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
	<h1>Catalogue de livres</h1>
	<form method="get" action="books">
		<div class="field">
			<label for="search">Rechercher</label>
			<input type="text" id="search" name="search" placeholder="Titre, auteur, ..." 
				<c:if test="${not empty requestScope.FILTER_SEARCH}">
				   value="${requestScope.FILTER_SEARCH}"
				</c:if>
			> 
		</div>
		
		<div class="field">
			<label for="type">Genre</label>
			<select name="type" id="type">
				<option value="-1">Tous les genres</option>
				<c:forEach items="${requestScope.BOOK_TYPES}" var="type">
					<option value="${type.id}" 
						<c:if test="${(not empty requestScope.FILTER_TYPE) && (requestScope.FILTER_TYPE == type.id)}">
						   selected="selected"
						</c:if>
					>${type.name}</option>
				</c:forEach>
			</select> 
		</div>
		
		<div class="field">
			<label for="availability">Livres disponibles</label> 
			<input type="checkbox" id="availability" name="availability"
				<c:if test="${(not empty requestScope.FILTER_AVAILABILITY) && (requestScope.FILTER_AVAILABILITY)}">
				   checked
				</c:if>
			> 
		</div>
		
		<button class="button">Filtrer</button>
	</form>
	<ul class="books">
		<c:forEach items="${requestScope.BOOKS}" var="book">
			<li class="book">
				<a href="borrow?bookID=${book.id}">
					<div class="cover">
						<img src="https://images-na.ssl-images-amazon.com/images/I/71EVW3NiEfL.jpg" alt="Livre" />
					</div>
					<div class="info">
						<header>
							<h3>${book.title}</h3>
							<p class="author">${book.author}</p>
						</header>
						<footer>
							<p class="gender">${book.bookType.name}</p>
							<p class="availability">
								<c:if test="${book.available}">
								    Disponible <i class="fa-solid fa-circle-check available"></i>
								</c:if>
								<c:if test="${not book.available}">
								    Indisponible <i class="fa-solid fa-circle-xmark unavailable"></i>
								</c:if>
							</p>
						</footer>
					</div>
				</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>