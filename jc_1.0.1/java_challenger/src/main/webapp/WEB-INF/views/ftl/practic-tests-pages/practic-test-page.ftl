<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Практические тесты</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="css/fav.ico">
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
    <!--CodeMirror css-->
    <link href="js/codemirror-5.26.0/theme/mdn-like.css" rel="stylesheet">
    <link rel="stylesheet" href="js/codemirror-5.26.0/lib/codemirror.css" type="text/css">
    <link rel=stylesheet href="js/codemirror-5.26.0/doc/docs.css">
    <link rel="stylesheet" href="js/codemirror-5.26.0/addon/hint/show-hint.css">
    <script src="js/codemirror-5.26.0/lib/codemirror.js"></script>
    <script src="Cjs/codemirror-5.26.0/addon/edit/matchbrackets.js"></script>
    <script src="js/codemirror-5.26.0/mode/clike/clike.js"></script>
    <script src="js/codemirror-5.26.0/addon/hint/show-hint.js"></script>


    <style type="text/css">
        body {
            padding-top: 60px;
            padding-bottom: 40px;
            background-color: #b9cbff;

        }
        .sidebar-nav {
            padding: 9px 0;
        }
    </style>


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
                    <li class="active"><a href="/practic-tests">Практические тесты</a></li>
                    <li><a href="/theoretic-ranking">Рейтинг</a></li>
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
    </div><!--/span-->
    <div class="span8 offset2">
        <div class="hero-unit">


            <div align="center"><h3><b>Задача №</b>${task.id}</h3></div>
            Найдите и исправьте ошибки в коде.<br>
            <form action="/practic-check" method="post">
                <div><textarea name="answer" id="java-code">${task.question}</textarea></div>
                <br>
                <center><button class="btn btn-primary" type="submit">Проверить</button></center>
            </form>

            <script>

                var javaEditor = CodeMirror.fromTextArea(document.getElementById("java-code"), {
                    lineNumbers: true,
                    matchBrackets: true,
                    mode: "text/x-java",
                    indentUnit: 2,
                    theme: 'mdn-like'
                });

            </script>
            <br></br><br></br>
        </div>
    </div>
</div><!--/row-->
<!--</div><!--/span-->
<!--</div><!--/row-->

<br></br><br></br>
<hr>
<footer>
    <div align="center"><p><h5>&copy;Java Challenger 2017</h5></p>
    </div>
</footer>
</body>
</html>

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