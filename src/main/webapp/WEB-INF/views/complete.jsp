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
	<h3>There are so many people who played a key role in the world of technology, here is a more complete list.</h3>
		<table align="center">
			<tr>
				<th>Person</th><th></th><th>Contribution</th><th>Year</th>
			</tr>
			<c:forEach var="complete" items="${completes}">
				<tr>
					<td>${complete.firstName}</td><td>${complete.lastName}</td>
					<td>${complete.innovation}</td><td>${complete.year}</td>
				</tr>
			</c:forEach>
		</table>
		
		<a href="/">link to tiny people</a>
		
	</div>
</body>
</html>