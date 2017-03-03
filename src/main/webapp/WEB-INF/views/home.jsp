<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="lanzar"><img src="http://www.gifsanimados.org/data/media/710/dado-imagen-animada-0092.gif" /></a>

<c:if test="${usuario!= null}">
	<h2>El Afortunado en leer es ${usuario.nombre}</h2>
</c:if>
<p>${usuario}</p>
<p>${historial}</p>
<p>${ranking}</p>

</body>
</html>
