<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>SILEN - Sistema Logística de entrega</title>

  <!--STYLESHEET-->
  <!--=================================================-->

  <!--Open Sans Font [ OPTIONAL ]-->
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>

  <!--Bootstrap Stylesheet [ REQUIRED ]-->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!--Nifty Stylesheet [ REQUIRED ]-->
  <link href="css/nifty.min.css" rel="stylesheet">

  <!--Nifty Premium Icon [ DEMONSTRATION ]-->
  <link href="css/demo/nifty-demo-icons.min.css" rel="stylesheet">

  <!--Demo [ DEMONSTRATION ]-->
  <link href="css/demo/nifty-demo.min.css" rel="stylesheet">

  <!--Morris.js [ OPTIONAL ]-->
  <link href="plugins/morris-js/morris.min.css" rel="stylesheet">

  <!--Magic Checkbox [ OPTIONAL ]-->
  <link href="plugins/magic-check/css/magic-check.min.css" rel="stylesheet">

  <!--JAVASCRIPT-->
  <!--=================================================-->

  <!--Pace - Page Load Progress Par [OPTIONAL]-->
  <link href="plugins/pace/pace.min.css" rel="stylesheet">
  <script src="plugins/pace/pace.min.js"></script>


  <!--jQuery [ REQUIRED ]-->
  <script src="js/jquery.min.js"></script>


  <!--BootstrapJS [ RECOMMENDED ]-->
  <script src="js/bootstrap.min.js"></script>


  <!--NiftyJS [ RECOMMENDED ]-->
  <script src="js/nifty.min.js"></script>

  <!--=================================================-->

  <!--Demo script [ DEMONSTRATION ]-->
  <script src="js/demo/nifty-demo.min.js"></script>


  <!--Morris.js [ OPTIONAL ]-->
  <script src="plugins/morris-js/morris.min.js"></script>
  <script src="plugins/morris-js/raphael-js/raphael.min.js"></script>


  <!--Sparkline [ OPTIONAL ]-->
  <script src="plugins/sparkline/jquery.sparkline.min.js"></script>


  <!--Specify page [ SAMPLE ]-->
  <script src="js/demo/dashboard.js"></script>

</head>

<body>
  <div id="container" class="effect aside-float aside-bright mainnav-lg">

    <!--NAVBAR-->
    <!--===================================================-->
    <header id="navbar">
      <div id="navbar-container" class="boxed">

        <!--Brand logo & name-->
        <!--================================-->
        <div class="navbar-header">
          <a href="index.html" class="navbar-brand">
            <img src="img/logo.png" alt="Silen Logo" class="brand-icon">
            <div class="brand-title">
              <span class="brand-text">Silen</span>
            </div>
          </a>
        </div>
        <!--================================-->
        <!--End brand logo & name-->

        <!--Navbar Dropdown-->
        <!--================================-->
        <div class="navbar-content clearfix">
          <ul class="nav navbar-top-links pull-left">

            <!--Navigation toogle button-->
            <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
            <li class="tgl-menu-btn">
              <a class="mainnav-toggle" href="#">
                <i class="demo-pli-view-list"></i>
              </a>
            </li>
            <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
            <!--End Navigation toogle button-->
          </ul>

          <ul class="nav navbar-top-links pull-right">

            <!--User dropdown-->
            <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
            <li id="dropdown-user" class="dropdown">
              <a href="#" data-toggle="dropdown" class="dropdown-toggle text-right">
                <span class="pull-right">
                  <i class="demo-pli-male ic-user"></i>
                </span>
                <div class="username hidden-xs">Gabriel Oriente</div>
              </a>

              <div class="dropdown-menu dropdown-menu-md dropdown-menu-right panel-default">

                <!-- User dropdown menu -->
                <ul class="head-list">
                  <li>
                    <a href="#">
                      <i class="demo-pli-male icon-lg icon-fw"></i> Profile
                    </a>
                  </li>
                </ul>

                <!-- Dropdown footer -->
                <div class="pad-all text-right">
                  <a href="login.html" class="btn btn-primary">
                    <i class="demo-pli-unlock"></i> Logout
                  </a>
                </div>
              </div>
            </li>
            <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
            <!--End user dropdown-->
          </ul>
        </div>
        <!--================================-->
        <!--End Navbar Dropdown-->

      </div>
    </header>
    <!--===================================================-->
    <!--END NAVBAR-->

    <div class="boxed">

      <!--CONTENT CONTAINER-->
      <!--===================================================-->
      <div id="content-container">

        <!--Page Title-->
        <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
        <div id="page-title">
          <h1 class="page-header text-overflow">Rotas</h1>
        </div>
        <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
        <!--End page title-->

        <!--Page content-->
        <!--===================================================-->

        <!-- TODOS DOCUMENTOS DEVEM SER FEITOS AQUI DENTRO -->
        <div class="row">
          <div class="col-sm-12">
            <div class="panel">
              <div class="col-sm-12">
                <div class="panel">
                  <div class="panel-heading">
                    <h3 class="panel-title">Rotas Disponíveis</h3>
                  </div>

                  <!--Bordered Table-->
                  <!--===================================================-->
                  <div class="panel-body">
                    <div class="table-responsive">
                      <table class="table table-bordered">
                        <thead>
                          <tr>
                            <th class="text-center">ID</th>
                            <th>Rotas</th>
                            <th>Confirmar</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr>
                            <td class="text-center">1</td>
                            <td><a href="#" class="btn-link">Rua x</a></td>
                            <td>Yes</td>
                          </tr>
                          <tr>
                            <td class="text-center">2</td>
                            <td><a href="#" class="btn-link">Rua y</a></td>
                            <td>Yes</td>
                            <tr>
                              <td class="text-center">3</td>
                              <td><a href="#" class="btn-link">Rua w</a></td>
                              <td>Yes</td>
                            </tr>
                          </tr>
                        </tbody>
                      </table>
                    </div>
                  </div>
                  <!--===================================================-->
                  <!--End Bordered Table-->

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- PRA CIMA -->
      <!--===================================================-->
      <!--End page content-->





      <!--ASIDE-->
      <!--===================================================-->
      <aside id="aside-container">
        <div id="aside">
          <div class="nano">
            <div class="nano-content">

              <!--Nav tabs-->
              <!--================================-->
              <ul class="nav nav-tabs nav-justified">
                <li class="active">
                  <a href="#demo-asd-tab-1" data-toggle="tab">
                    <i class="demo-pli-speech-bubble-7"></i>
                  </a>
                </li>
                <li>
                  <a href="#demo-asd-tab-2" data-toggle="tab">
                    <i class="demo-pli-information icon-fw"></i> Report
                  </a>
                </li>
                <li>
                  <a href="#demo-asd-tab-3" data-toggle="tab">
                    <i class="demo-pli-wrench icon-fw"></i> Settings
                  </a>
                </li>
              </ul>
              <!--================================-->
              <!--End nav tabs-->

            </div>
          </div>
        </div>
      </div>
    </aside>
    <!--===================================================-->
    <!--END ASIDE-->


    <!--MAIN NAVIGATION-->
    <!--===================================================-->
    <nav id="mainnav-container">
      <div id="mainnav">

        <!--Menu-->
        <!--================================-->
        <div id="mainnav-menu-wrap">
          <div class="nano">
            <div class="nano-content">

              <!--Profile Widget-->
              <!--================================-->
              <div id="mainnav-profile" class="mainnav-profile">
                <div class="profile-wrap">
                  <div class="pad-btm">
                    <img class="img-circle img-sm img-border" src="img/profile-photos/1.png" alt="Profile Picture">
                  </div>
                  <a href="#profile-nav" class="box-block" data-toggle="collapse" aria-expanded="false">
                    <span class="pull-right dropdown-toggle"></span>
                    <p class="mnp-name">Gabriel Oriente</p>
                    <span class="mnp-desc">silen@gmail.comm</span>
                  </a>
                </div>
              </div>

              <ul id="mainnav-menu" class="list-group">

                <!--Category name-->
                <li class="list-header">Menu</li>

                <!--Menu list item-->
                <li>
                  <a href="motoboy_inicio.html">
                    <i class="demo-psi-home"></i>
                    <span class="menu-title">
                      <strong>Inicio</strong>
                    </span>
                  </a>
                </li>

                <!--Menu list item-->
                <li class="active-link">
                  <a href="motoboy_entregas.jsp">
                    <i class="demo-psi-receipt-4"></i>
                    <span class="menu-title">
                      <strong>Entregas</strong>
                    </span>
                  </a>
                </li>

                <li>
                  <a href="motoboy_tempo.html">
                    <i class="demo-psi-thunder"></i>
                    <span class="menu-title">
                      <strong>Tempo</strong>
                    </span>
                  </a>
                </li>


                <li>
                  <a href="motoboy_contato.html">
                    <i class="demo-psi-mail"></i>
                    <span class="menu-title">
                      <strong>Contato</strong>
                    </span>
                  </a>
                </li>


                <!--================================-->
                <!--End widget-->
</ul>
              </div>
            </div>
          </div>
          <!--================================-->
          <!--End menu-->

        </div>
      </nav>
      <!--===================================================-->
      <!--END MAIN NAVIGATION-->

    </div>

    <!-- FOOTER -->
    <!--===================================================-->
    <footer id="footer">
      <p class="pad-lft">&#0169; 2017 Silen</p>
    </footer>
    <!--===================================================-->
    <!-- END FOOTER -->

  </div>
  <!--===================================================-->
  <!-- END OF CONTAINER -->

</body>
</html>
