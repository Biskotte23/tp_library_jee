<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bibliothèque</title>
</head>
<body>
	<h1>Catalogue de livres</h1>
	<form>
		<label for="filtreLivreAuteur">Recherche livre/auteur:</label> 
		<input type="text" id="filtreLivreAuteur" name="filtreLivreAuteur">
		<br>
		
		<label>Recherche par genre</label>
		<br>
		<input type="checkbox" id="action" name="action" value="action">
		<label for="action">action</label><br>
		  
		<label>Afficher les livres indisponible:</label>
		<input type="checkbox"> 
		<br>
		<input type="submit" value="Rechercher">
	</form>
	<ul>
		<li><a href="#"><p>Titre livre 1</p>
				<p>Auteur 1</p>
				<p>Genre 1</p> <a></li>
		<li><a href="#"><p>Titre livre 2</p>
				<p>Auteur 2</p>
				<p>Genre 2</p></a></li>
		<li><a href="#"><p>Titre livre 3</p>
				<p>Auteur 3</p>
				<p>Genre 3</p></a></li>
	</ul>
</body>
</html>