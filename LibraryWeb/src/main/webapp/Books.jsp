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
	<h1>Catalogue de livres</h1>
	<form>
		<div class="field">
			<label for="search">Rechercher</label>
			<input type="text" id="search" name="search" placeholder="Titre, auteur, ..."> 
		</div>
		
		<div class="field">
			<label for="gender">Genre</label>
			<select name="gender" id="gender">
				<option value="">Tous les genres</option>
			</select> 
		</div>
		
		<div class="field">
			<label>Livres disponibles</label> 
			<input type="checkbox"> 
		</div>
		
		<input type="submit" value="Filtrer">
	</form>
	<ul class="books">
		<li class="book">
			<a href="#">
				<div class="cover">
					<img src="https://images-na.ssl-images-amazon.com/images/I/71EVW3NiEfL.jpg" alt="Livre" />
				</div>
				<div class="info">
					<header>
						<h3>The ONE Thing</h3>
						<p class="author">Gary Keller</p>
					</header>
					<footer>
						<p class="gender">Développement personnel</p>
						<p class="availability">Disponible <i class="fa-solid fa-circle-check available"></i></p>
					</footer>
				</div>
			</a>
		</li>
		<li class="book">
			<a href="#">
				<div class="cover">
					<img src="https://images-na.ssl-images-amazon.com/images/I/71EVW3NiEfL.jpg" alt="Livre" />
				</div>
				<div class="info">
					<header>
						<h3>The ONE Thing: passez à l'essentiel</h3>
						<p class="author">Gary Keller, Jay Papasan</p>
					</header>
					<footer>
						<p class="gender">Développement personnel</p>
						<p class="availability">Indisponible <i class="fa-solid fa-circle-xmark unavailable"></i></p>
					</footer>
				</div>
			</a>
		</li>
	</ul>
</body>
</html>