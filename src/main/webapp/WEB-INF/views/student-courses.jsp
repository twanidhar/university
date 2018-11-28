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
				<th> My Course</th><th>Description</th><th>Current grade</th>
			</tr>
			<c:forEach var="enrolledIn" items="${myCourses}">
				<tr>
					<td>${enrolledIn.course.name}</td><td>${enrolledIn.semester}</td><td>${enrolledIn.grade}</td>
				</tr>
			</c:forEach>
		</table>
	
	
</body>
</html>