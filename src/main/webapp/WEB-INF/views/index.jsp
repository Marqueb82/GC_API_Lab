<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="mystyle.css">
<title>Tiny People</title>
</head>
<body>
	<div class="important">
	<h3>This list contains some of the most important people in the history of technology</h3>
		<table align="center">
			<tr>
				<th>Person</th><th>Contribution</th><th>Year</th>
			</tr>
			<c:forEach var="tiny" items="${tinys}">
				<tr>
					<td>${tiny.name}</td><td>${tiny.invented}</td><td>${tiny.year}</td>
				</tr>
			</c:forEach>
		</table>
		
		<a href="/complete">link to complete list</a>
		
	</div>
</body>
</html>