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
<title>Input new article</title>
</head>
<body>
	<form:form action="savearticle" method="POST" modelAttribute="article">
		id: <form:input path="id"/> <form:errors path="id" cssClass="error"/> <br/><br/>
		header: <form:input path="header"/> <form:errors path="header" cssClass="error"/> <br/><br/>
		group: <form:input path="group"/> <form:errors path="group" cssClass="error"/> <br/><br/>
		preview: <form:input path="preview"/> <form:errors path="preview" cssClass="error"/> <br/><br/>
		body: <form:input path="body"/> <form:errors path="body" cssClass="error"/> <br/><br/>
		href_1: <form:input path="href_1"/> <form:errors path="href_1" cssClass="error"/> <br/><br/>
		href_2: <form:input path="href_2"/> <form:errors path="href_2" cssClass="error"/> <br/><br/>
     	<button type="submit">Submit</button>
	</form:form>
</body>
</html>
