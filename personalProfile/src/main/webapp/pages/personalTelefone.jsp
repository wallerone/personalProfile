<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Profile</title>
		<link rel="stylesheet" href="../resources/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="../resources/css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" href="../resources/css/personalProfile.css"/>
		<script type="text/javascript" src="bootstrap.min.js"></script>
		<script type="text/javascript" src="../resources/js/jquery-1.12.3.min.js"></script>
		<script type="text/javascript" src="../resources/js/jquery-mask-min.js"></script>
		<script type="text/javascript" src="../resources/js/personalProfile.js"></script>
		<link rel="icon" href="../resources/img/perfil2.jpg">
	</head>
	<body>
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">Telefones</a>
					</div>
			  	</div>
			</nav>
			
			<div class="barraLadoEsquerdo">
				<div class="btn-group-vertical menuEsquerdo" role="group">
					<img alt="Foto do perfil" src="../resources/img/perfil.jpg"
						class="imagemPerfil">
					<button type="button" class="btn btn-default" onclick="redirecionarPaginaProfile()">Dados pessoais</button>
					<button type="button" class="btn btn-default" onclick="redirecionarAgendaPessoal()">Agenda Pessoal</button>
					<button type="button" class="btn btn-default" onclick="redirecionarGaleria()">Galeria</button>
					<button type="button" class="btn btn-default" onclick="redirecionarTelefones()">Telefones</button>
				</div>
			</div>
		<main>
			<div class="corpoDireito">
				<div class="bodyDados">
					<table class="table tableTelefone">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Sobrenome</th>
								<th>Telefone</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Mário</td>
								<td>Haysaki Júnior</td>
								<td>(62)98218-0015</td>
							</tr>
							<tr>
								<td>Wallace</td>
								<td></td>
								<td>(62)9333-0333</td>
							</tr>
							<tr>
								<td>Leonardo</td>
								<td>Rocha</td>
								<td>(62)9444-4444</td>
							</tr>
							<tr>
								<td>Igor</td>
								<td>Montenegro</td>
								<td>(62)9555-5555</td>
							</tr>
						</tbody>
					</table>
					<div class="paginacaoTelefone">
						<ul class="pagination">
						    <li>
						      <a href="#" aria-label="Previous">
						        <span aria-hidden="true">&laquo;</span>
						      </a>
						    </li>
						    <li><a href="#">1</a></li>
						    <li><a href="#">2</a></li>
						    <li><a href="#">3</a></li>
						    <li><a href="#">4</a></li>
						    <li><a href="#">5</a></li>
						    <li>
						      <a href="#" aria-label="Next">
						        <span aria-hidden="true">&raquo;</span>
						      </a>
						    </li>
						  </ul>
					  </div>
				</div>
			</div>
		</main>
	</body>
</html>