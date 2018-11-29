<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Courses</h1>
	<br>
	<table align="center">
		<tr>
			<th>Course</th><th>Description</th>
		</tr>
		
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.first}</td><td>${student.last}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/admin-courses">Go to admin courses</a>
</body>
</html>