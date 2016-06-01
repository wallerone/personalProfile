<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" href="resources/css/personalProfile.css"/>
		<script type="text/javascript" src="bootstrap.min.js"></script>
		<script type="text/javascript" src="resources/js/jquery-1.12.3.min.js"></script>
		<script type="text/javascript" src="resources/js/jquery-mask-min.js"></script>
		<script type="text/javascript" src="resources/js/personalProfile.js"></script>
		<link rel="icon" href="resources/img/perfil2.jpg">
	</head>
	
	<body class="bodyLogin">
		<div class="panel panel-primary divLogin">
			<div class="panel-heading">
				Login Personal Profile
			</div>
			<div class="panel-body">
				Usuário: 
				<div class="input-group">
					<span class="input-group-addon glyphicon glyphicon-user" id="basic-addon1"></span>
					<input type="text" id="usuario" class="form-control">
				</div>
				Senha:
				<div class="input-group">
					<span class="input-group-addon glyphicon glyphicon-lock" id="basic-addon1"></span>
					<input type="password" id="senha" class="form-control">
				</div>
				<div class="divBtnEntrar">
					<button class="btn btn-success btnEntrar" type="button"
						 onclick="redirecionarPaginaPersonal()">Entrar</button>
				</div>
			</div>
		</div>
	</body>
</html>