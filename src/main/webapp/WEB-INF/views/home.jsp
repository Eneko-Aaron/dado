<%@ include file="includes/header.jsp"%>
<div id="contenedor">

	<div id="titulo">
		<h1>¡¡DADO DE LA FORTUNA!!</h1>
	</div>

	<div id="dado">
		<img src="resources/img/dado.gif" /> <br> 
		<a href="lanzar" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Lanzar dado</a>

	</div>
	<br>
	<c:if test="${usuario!= null}">
		<div class="alert alert-success">

			El afortunado en leer es: <strong>${usuario.nombre}</strong>
		</div>
	</c:if>
	
	<div id="ranking">
		<img id="imgranking" src="resources/img/ranking.png" /> <br>
		<br>
		<table border=1 class="table">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Tirada</th>
					<th>Fecha</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${ranking}" var="r">
					<tr>
						<td>${r.nombre}</td>
						<td>${r.numTiradas}</td>
						<td><c:forEach var="tirada" items="${r.tiradas}" end="0">
								<c:out value="${tirada.fecha}" />
							</c:forEach></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br> <br>
	<div id="estadisticas">
	<div id="tituloestadisticas">
	<h1>Estadisticas</h1>
	</div>
		<a href="estadisticas"><img id="grafico" src="resources/img/stats.png"></a>
	</div>
</div>

<%@ include file="includes/footer.jsp"%>