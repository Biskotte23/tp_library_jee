<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Se connecter</title>
</head>
<body>
	<form action="login" method="post">
		<fieldset>
			<legend>Connexion</legend>
			<table>
				<tr>
					<td>Identifiant</td>
					<td><input type="text" name="login" />
					<td></td>
				</tr>
				<tr>
					<td>Mot de passe:</td>
					<td><input type="password" name="password" />
					<td></td>
				</tr>
			</table>
		</fieldset>
		<input type="submit" value="Connexion" />
	</form>
</body>
</html>