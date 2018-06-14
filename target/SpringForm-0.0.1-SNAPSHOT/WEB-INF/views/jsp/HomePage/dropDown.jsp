<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="/resources/css/header.css"> -->
<link href="<c:url value="/resources/css/header.css" />" rel="stylesheet">
<!-- css/header.css -->
<title>Home page</title>
</head>
<body>

<ul>
  <li><a href="#home">Home</a></li>
  <li class="dropdown">
  	<a href="#news">Kinh tế</a>
  	<div class="dropdown-content">
      <a href="#">Kinh tế vĩ mô</a>
      <a href="#">Chứng khoán</a>
      <a href="#">Kinh tế quốc tế</a>
    </div>
  </li>
  
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Bóng đá</a>
    <div class="dropdown-content">
      <a href="#">Ngoại hạng anh</a>
      <a href="#">Champion league</a>
      <a href="#">World cup</a>
    </div>
  </li>
</ul>

	<h2>add-user.jsp</h2>
		Id: ${std.id} <br/>
		Name: ${std.name}<br/>
</body>
</html>
