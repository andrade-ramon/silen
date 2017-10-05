<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Acesso - Sistema</title>
  <meta name = "viewport" content="width-device-width, initial-scale=1  maximum-scale=1, user-scalable=no" />
  <meta charset = "utf-8"/>

  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/nifty.min.css" rel="stylesheet">
  <link href="css/demo/nifty-demo-icons.min.css" rel="stylesheet">
  <link href="css/demo/nifty-demo.min.css" rel="stylesheet">
  <link href="plugins/morris-js/morris.min.css" rel="stylesheet">
  <link href="plugins/magic-check/css/magic-check.min.css" rel="stylesheet">
  <link href="plugins/pace/pace.min.css" rel="stylesheet">

  <script src="plugins/pace/pace.min.js"></script>
  <script src="js/jquery.min.js"></script>  
  <script src="js/bootstrap.min.js"></script>
  <script src="js/nifty.min.js"></script>
  <script src="js/demo/nifty-demo.min.js"></script>
  <script src="plugins/morris-js/morris.min.js"></script>
  <script src="plugins/morris-js/raphael-js/raphael.min.js"></script>
  <script src="plugins/sparkline/jquery.sparkline.min.js"></script>
  <script src="js/demo/dashboard.js"></script>

  <link href="css/estiloLogin.css" rel="stylesheet" media = "screen"/>
  <script src = "js/acesso.js"></script>
  <script src = "js/main.js"></script>

</head>

<body>

  <div class="container-fluid" id="form-container">
    <div class="panel " id="form-box">
      <form class="form-group" action="FrontController" method="post">
        <h3 class="text-center"> <img class="text-center" src = "img/silen/logo2.jpg"> </h3>

      <div class="form-group">
        <label class="sr-only" for="login">UsuÃ¡rio</label>
        <div class="input-group">
          <div class="input-group-addon">
            <span class="glyphicon glyphicon-user"></span>
          </div>
          <input id="login" type="text" name="login" class="form-control" placeholder="Seu login de usuÃ¡rio" maxlength="50">
        </div>
      </div>

      <div class="form-group" >
        <label class="sr-only" for="senha">Senha</label>
        <div class="input-group">
          <div class="input-group-addon">
            <span class="glyphicon glyphicon-lock"></span>
          </div>
          <input id="password" type="password" name="senha" class="form-control" placeholder="Digite sua senha" maxlength="50">
        </div>
      </div>

      <button type="button" onclick="acessar()" class="btn btn-success form-control">Entrar</button>
      <!--<button type="submit" name="command" class=" btn btn-info" value="Motoboy_buscarEntregas">Entregas</button>-->
</form>
      

    </div>
  </div>
</body>
</html>
