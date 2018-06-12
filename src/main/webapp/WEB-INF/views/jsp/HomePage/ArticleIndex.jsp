<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/header.css"> -->
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">
<!-- css/header.css -->
<title>Article indexing</title>
</head>
<body>
this is article page
<h2>
         <tr><td><a>id:  <c:out value = "${art.id}"/></a></td><br>
         <td>name:  <c:out value = "${art.name}"/></td><br>
         </tr>
         <br>
</h2>

</body>
</html>
