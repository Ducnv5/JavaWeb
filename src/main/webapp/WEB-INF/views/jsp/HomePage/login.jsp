<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/header.css"> -->
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">
<!-- css/header.css -->
<title>Login</title>
</head>
<body>
Please input user name and password
<h2>
         <form:form action="addarticle" method="POST" modelAttribute="user">
		user name: <form:input path="userName"/> <form:errors path="userName" cssClass="error"/> <br/><br/>
		password: <form:input path="password"/> <form:errors path="password" cssClass="error"/> <br/><br/>
     <button type="submit">Submit</button>
	</form:form>
</h2>

</body>
</html>
