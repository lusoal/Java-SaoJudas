
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Index</title>
</head>
<body>
<!-- Barra superior com os menus de navegação -->
<c:import url="Menu.jsp"/>
<!-- Container Principal -->

<div class="container">
  <h2>Bem vindo ao sistema de cadastro de paises</h2> 
  
    <div class="row">
		<div class="span12">
			<form class="form-horizontal" action="controller.do" method="POST">
			  <fieldset>
			    <div id="legend">
			      <legend class="">Login</legend>
			    </div>
			    <div class="control-group">
			      <!-- Username -->
			      <label class="control-label"  for="username">Username</label>
			      <div class="controls">
			        <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
			      </div>
			    </div>
			    <div class="control-group">
			      <!-- Password-->
			      <label class="control-label" for="password">Password</label>
			      <div class="controls">
			        <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
			      </div>
			    </div>
			    <div class="control-group">
			      <!-- Button -->
			      <div class="controls">
			        <button class="btn btn-success" type="submit" name="command" value="RealizarLogin">Login</button>
			      </div>
			    </div>
			  </fieldset>
			</form>
		</div>
	</div>
	</br>
	</br>
	</br>
	<div class="row">
		<div class="span12">
			<form class="form-horizontal" action="controller.do" method="POST">
			  <fieldset>
			    <div id="legend">
			      <legend class="">Realizar Cadastro de Usuario</legend>
			    </div>
			    <div class="control-group">
			      <!-- Username -->
			      <label class="control-label"  for="username">Username</label>
			      <div class="controls">
			        <input type="text" id="username" name="usuario" placeholder="" class="input-xlarge">
			      </div>
			    </div>
			    <div class="control-group">
			      <!-- Password-->
			      <label class="control-label" for="password">Password</label>
			      <div class="controls">
			        <input type="password" id="password" name="senha" placeholder="" class="input-xlarge">
			      </div>
			    </div>
			    <div class="control-group">
			      <!-- Button -->
			      <div class="controls">
			        <button class="btn btn-success" type="submit" name="command" value="CriarUsuario">Cadastrar</button>
			      </div>
			    </div>
			  </fieldset>
			</form>
		</div>
	</div>
 
  
</div>


</body>
</html>