var login = $("#login");
var password = $("#password");

function acessar(){
  var login = $("#login").val();
  var password = $("#password").val();
  
  if (login=="admin" && password=="admin") {
    //window.location = "administrador_inicio.html";
    window.location = "inicio";
  }else if (login=="boy" && password=="boy") {
    window.location = "motoboy_inicio.html";
  }else if (login=="cliente" && password=="cliente") {
    window.location = "cliente_contato.html";
  }else if (login=="motoboy3" && password=="motoboy3") {
	    window.location = "motoboy_inicio.html";
  }else {
    alert("Login ou senha incorretos!");
  }
}
