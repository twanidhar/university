<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>

	<h1>List of Courses</h1>
	<br>
	<table align="center">
			<tr>
				<th> My Course</th><th>Description</th>
			</tr>
			<c:forEach var="course" items="${myCourses}">
				<tr>
					<td>${course.name}</td><td>${course.category}</td>
				</tr>
			</c:forEach>
		</table>
	
	
</body>
</html>