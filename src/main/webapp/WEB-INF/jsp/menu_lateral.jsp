<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav id="mainnav-container">
	<div id="mainnav">
		<div id="mainnav-menu-wrap">
      		<div class="nano">
        		<div class="nano-content">
          			<div id="mainnav-profile" class="mainnav-profile">
            			<div class="profile-wrap">
              				<div class="pad-btm">
                				<img class="img-circle img-sm img-border" src="${pageContext.request.contextPath}/img/profile-photos/1.png" alt="Profile Picture">
              				</div>
              				<a href="#profile-nav" class="box-block" data-toggle="collapse" aria-expanded="false">
                				<span class="pull-right dropdown-toggle"></span>
                				<p class="mnp-name">${user.name}</p>
                				<span class="mnp-desc">${user.login}</span>
              				</a>
            			</div>
          			</div>
					<ul id="mainnav-menu" class="list-group">
						<li class="list-header">Menu</li>
		                <li>
							<a href="/home">
		                    	<i class="demo-psi-home"></i>
		                    	<span class="menu-title"><strong>Inicio</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="/clientes">
		                    	<i class="demo-psi-receipt-4"></i>
		                    	<span class="menu-title"><strong>Clientes</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="/motoboys">
		                    	<i class="demo-psi-receipt-4"></i>
		                    	<span class="menu-title"><strong>Motoboys</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="/entregas">
		                    	<i class="demo-psi-receipt-4"></i>
		                    	<span class="menu-title"><strong>Entregas</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="administrador_rastrear.html">
								<i class="demo-psi-tactic"></i>
		                    	<span class="menu-title"><strong>Rastrear</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="administrador_relatorio.html">
		                    	<i class="demo-psi-bar-chart"></i>
	                    		<span class="menu-title"><strong>Relatório</strong></span>
		                  	</a>
		                </li>
		                <li>
							<a href="#">
		                    	<i class="demo-psi-pen-5"></i>
		                    	<span class="menu-title"><strong>Cadastro</strong></span>
		                    	<i class="arrow"></i>
		                  	</a>
		                  	<ul class="collapse">
		                    	<li><a href="">Funcionário</a></li>
		                    	<li><a href="">Cliente</a></li>
		                  	</ul>
		                </li>
		                <li>
							<a href="administrador_contato.html">
		                    	<i class="demo-psi-mail"></i>
		                    	<span class="menu-title"><strong>Contato</strong></span>
		                  	</a>
		                </li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</nav>