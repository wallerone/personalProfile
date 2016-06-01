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
						<a class="navbar-brand" href="#">Galeria</a>
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
					<button class="btn btn-primary" type="button">Inserir foto</button>
					<div class="row">
						<div class="col-md-6 divCentro">
							<img alt="Imagem Galeria 1" src="../resources/img/galeria1.jpg"
								class="imagemGaleria">
						</div>
						<div class="col-md-6 divCentro">
							<img alt="Imagem Galeria 2" src="../resources/img/galeria2.jpg"
								class="imagemGaleria">
						</div>
					</div>
					
					<div class="row">
						<div class="col-md-6 divCentro">
							<img alt="Imagem Galeria 3" src="../resources/img/galeria3.jpg"
								class="imagemGaleria">
						</div>
						<div class="col-md-6 divCentro">
							<img alt="Imagem Galeria 4" src="../resources/img/galeria4.jpg"
								class="imagemGaleria">
						</div>
					</div>
				</div>
			</div>
		</main>
	</body>
</html>