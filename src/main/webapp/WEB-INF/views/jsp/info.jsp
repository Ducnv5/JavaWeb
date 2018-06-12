<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
	<h2>Information</h2>
	<table>
		<tr>
			<td>Author: </td>
			<td>${info.author }</td>
		</tr>
		<tr>
			<td>License: </td>
			<td>${info.license }</td>
		</tr>
		<tr>
			<td>Number: </td>
			<td>${info.number }</td>
		</tr>

	</table>
</body>
</html>
