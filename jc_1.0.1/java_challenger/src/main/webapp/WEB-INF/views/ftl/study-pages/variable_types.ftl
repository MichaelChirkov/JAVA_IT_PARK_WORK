<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Java Challenger</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="css/fav.ico">
    <style type="text/css">
        body {
            padding-top: 60px;
            padding-bottom: 40px;
            background-color: #ffc97e;
        }
        .sidebar-nav {
            padding: 9px 0;
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
                    <li class="active"><a href="/types">Учебные материалы</a></li>
                    <li><a href="/theoretic-tests">Теоретические тесты</a></li>
                    <li><a href="/practic-tests">Практические тесты</a></li>
                    <li><a href=/theoretic-ranking>Рейтинг</a></li>
                    <li><a href="/contact">Контактная информация</a></li>
                </ul>
            <#if user??>
                <li class="navbar-text dropdown pull-right">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Мой профиль<b class="caret"></b></a>
                    <ul id="menu1" class="dropdown-menu">
                        <center><li>Имя пользователя: <b>${user.name}</b></li></center>
                        <li class="divider"></li>
                        <li><a href="#"><i class="icon-pencil"></i>Редактировать</a></li>
                        <li><a href="/logout"><i class="icon-off"></i>Выйти</a></li>
                    </ul>
                </li>
            </#if>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span3">
            <div class="well sidebar-nav">

                <ul class="nav nav-list">
                    <li class="nav-header">Разделы</li>
                    <li><a href="/data_types">Типы данных</a></li>
                    <li><a href="/variable_types">Типы переменных</a></li>
                    <li><a href="/cycles_in_java">Циклы</a></li>
                    <li><a href="/classes">Классы и объекты</a></li>
                </ul>
            </div><!--/.well -->
        </div><!--/span-->
        <div class="span9">
            <div class="hero-unit">
            ${theme.text}
            </div>
        </div><!--/row-->
    </div><!--/span-->
</div><!--/row-->

<footer>
    <div align="center"><p><h5>&copy;       Java Challenger 2017</h5></p></div>
</footer>


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