<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<td name="user">${borrow.user.login}</td>
			<td><input type="submit" value="Livre rendu"></td>
		</tr>
		</form>
	</c:forEach>
</table>