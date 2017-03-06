<%@ include file="../includes/header.jsp"%>
<div id="contenedor">
	<h1>Gestión de usuarios</h1>

	<button type="button" class="btn btn-success" data-toggle="modal"
		data-target="#modalcrear">Crear</button>


	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Usuario</th>
				<th>Estado</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${usuarios}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.nombre}
					</td>
					<td>
			<c:if test="${u.fechaBaja == null}">
				Alta
			</c:if> 
			<c:if test="${u.fechaBaja != null}">
				Baja
			</c:if></td>
					<td>
						
							<button type="button" class="btn btn-info" data-toggle="modal"
							data-target="#modalmodificar">Modificar</button>
							
							
							<br>
					
					
					
					
					<a href="admin/eliminar/${id}"><button type="button" class="btn btn-danger">Eliminar</button></a>

							<br>
							
							<c:if test="${u.fechaBaja == null}">
							<a href="admin/dardebaja/${u.id}">
							<button type="button" class="btn btn-warning" >Dar de baja</button></a>
							</c:if> 
							<c:if test="${u.fechaBaja != null}">
							<a href="admin/dardealta/${u.id}">
							<button type="button" class="btn btn-warning" >Dar de alta</button></a>
							</c:if>
							
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<!-- Modal crear -->
	<div id="modalcrear" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Crear Usuario</h4>
				</div>
				<div class="modal-body">
					<img src="resources/img/usuario.png">
					<div class="form-group row">
						<label for="example-text-input">Nombre</label>
						<div class="col-10">
							<input class="form-control" type="text" id="example-text-input">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Crear
						usuario</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>

	<!-- Modal modificar -->
	<div id="modalmodificar" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Modificar Usuario</h4>
				</div>
				<div class="modal-body">
					<img src="resources/img/usuario.png">
					<div class="form-group row">
						<label for="example-text-input">Nombre</label>
						<div class="col-10">
							<input class="form-control" type="text" id="example-text-input">
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Modificar
						Usuario</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>








</div>
<%@ include file="../includes/footer.jsp"%>
