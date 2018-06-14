<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/header.css"> -->
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">
<!-- css/header.css -->
<title>Home page foreach</title>
</head>
<body>
<form action="login" method = POST>
	<button type="submit">Log in</button>
</form>
<br>
<c:forEach var = "i" items = "${students}">
         <tr><td><a href="article/${i.id}" >id:  <c:out value = "${i.id}"/></a></td><br>
         <td>name:  <c:out value = "${i.name}"/></td><br>
         </tr>
         <br>
</c:forEach>

</body>
</html>
