<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListView</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- <link href="/css/bootstrap.min.css" rel="stylesheet"> -->
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}

#listShopView tr:first-child {
	font-weight: bold;
}
</style>

</head>
<body>
	<div class="container">
		<table class="table table-hover " width="500px">
			<thead>
				<tr id="listShopView">
					<th>ID</th>
					<th>Username</th>
					<th>Name</th>
					<th>Experience</th>
					<th>Country</th>
					<th>City</th>
					
				</tr>
			</thead>

			<c:forEach var="listBusinesses" items="${allOfBusiness}">
				<c:forEach var="listLocations" items="${allOfLocation}">
				<tbody>
					<tr>
						<td>${listBusinesses.id}</td>
						<td>${listLocations.userName}</td>
						<td>${listBusinesses.name}</td>
						<td>${listBusinesses.experience}</td>
						<td>${listLocations.country}</td>
						<td>${listLocations.city}</td>
					</tr>
				</tbody>
				</c:forEach>
			</c:forEach>
		</table>

	</div>
</body>
</html>