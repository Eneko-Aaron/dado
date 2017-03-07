<%@ include file="../includes/header.jsp"%>
<div id="contenedor">
	<div id="titulo">
		<h1>Estadisticas</h1>
	</div>
	<br>
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<table class="table">
				<thead>
					<tr>
						<th>Nombre</th>
						<th>Fecha de la tirada</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${historial}" var="h">
						<tr class="info">
							<td>${h.u.nombre}</td>
							<td>${h.fecha}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>


<%@ include file="../includes/footer.jsp"%>
