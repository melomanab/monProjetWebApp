<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

<!-- Directive JSP nécessaire pour permettre l'utilisation des balises JSTL de la bibliothèque Core  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test JSTL</title>
</head>
<body>

	<h1>Ceci est une page JSP renvoyée par une servlet</h1>


	<h2> Tags JSTL ou comment ne plus écrire de Java dauns une JSP </h2>


	</b><c:out value="Affichage en JSTL"/> </br></br> 
	
	<c:out value="Affichage d'un attribut JSTL:"/></br>
	Attribut: <c:out value="${legumes[1]}"/> </br></br>
	
	<c:out value="Une boucle JSTL:"/></br>
	<c:forEach var="item" items="${legumes}" >
	<c:out value="${item}" /></br>
	</c:forEach></br>
	
	<c:out value="Creation et affichage d'une variable avec JSTL:"/></br>
	<c:set var="message" value="Hello world!" scope="request" />
	Option affichage 1: <c:out value="${message}"/></br>
	Option affichage 2: <c:out value="${requestScope.message}"/></br></br>
	
	<c:out value="Modification"/>
	<c:set var="message" value="I'm Bea"/> </br>
	<c:out value="${message}"/></br></br>
	
	
	<!-- Les quatre syntaxes suivantes retournent le deuxième élément de la liste de légumes  -->
     Cookies:  ${ desserts.cookies }<br />
     Glaces:   ${ desserts.get("glaces") }<br />
     Muffins:  ${ desserts['muffins'] }<br />
    <!--  ${ desserts["tartes aux pommes"] }<br /> -->
    
    
	



</body>
</html>