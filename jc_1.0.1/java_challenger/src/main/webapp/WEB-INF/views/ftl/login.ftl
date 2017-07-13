<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Sign in Java Challenger</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">






    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="css/fav.ico">
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #ffc97e;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #f5f5f5;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            box-shadow: 0 1px 2px rgba(0,0,0,.05);
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }
        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }

    </style>
    <link href="css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>





<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="#">Java Challenger</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li><a href="/home">Главная</a></li>
                    <li><a href="/study">Учебные материалы</a></li>
                    <li><a href="/theoretic-tests">Теоретические тесты</a></li>
                    <li><a href="/practic-tests">Практические тесты</a></li>
                    <li><a href="/theoretic-ranking">Рейтинг</a></li>
                    <li><a href="/contact">Контактная информация</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
<br></br><br></br>

<div class="container">

    <form class="form-signin" action="/login" method="post">
        <h2 class="form-signin-heading" align="center">Авторизация</h2>
        <#if logout>
            <div class="alert alert-info" role="alert">Вы успешно вышли из профиля.</div>
        </#if>
    <#if error>
        <div class="alert alert-danger" role="alert">Неправильный логин или пароль. Повторите ввод.</div>
    </#if>
    <#if registr_success>
        <div class="alert alert-success" role="alert">Вы успешно зарегистрированы, пожалуйста выполните вход.</div>
    </#if>
        <input type="text" required class="input-block-level" name="username" placeholder="E-mail">
        <input type="password" required class="input-block-level" name="password" placeholder="Password">

        <div align="center">
            <button class="btn btn-large btn-primary" type="submit">Войти</button>
        </div>
        <br></br>
        <div align="right">
            <p><span class="info"></span><a href="/registration"><h4>Регистрация</h4></a></p>
        </div>
    </form>

</div> <!-- /container -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap-transition.js"></script>
<script src="js/bootstrap-alert.js"></script>
<script src="js/bootstrap-modal.js"></script>
<script src="js/bootstrap-dropdown.js"></script>
<script src="js/bootstrap-scrollspy.js"></script>
<script src="js/bootstrap-tab.js"></script>
<script src="js/bootstrap-tooltip.js"></script>
<script src="js/bootstrap-popover.js"></script>
<script src="js/bootstrap-button.js"></script>
<script src="js/bootstrap-collapse.js"></script>
<script src="js/bootstrap-carousel.js"></script>
<script src="js/bootstrap-typeahead.js"></script>

</body>
</html>