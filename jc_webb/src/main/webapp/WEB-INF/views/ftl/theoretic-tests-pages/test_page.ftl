<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Теоретические тесты</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="css/fav.ico">
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
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
            <a class="brand" href="#">Michaels Challenger</a>
            <div class="nav-collapse collapse">
                <!--<li class="navbar-text dropdown pull-right">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Мой профиль<b class="caret"></b></a>
                    <ul id="menu1" class="dropdown-menu">
                        <center><li>Имя пользователя: <b><%=user.getLogin()%></b></li></center>
                        <li class="divider"></li>
                        <li><a href="#"><i class="icon-pencil"></i>Редактировать</a></li>
                        <li><a href="/logOut"><i class="icon-off"></i>Выйти</a></li>
                    </ul>
                </li> -->
                <ul class="nav">
                    <li><a href="/home">Главная</a></li>
                    <li><a href="/study">Учебные материалы</a></li>
                    <li class="active"><a href="/tests">Теоретические тесты</a></li>
                    <li><a href="/practic-tests">Практические тесты</a></li>
                    <li><a href="/ranking">Рейтинг</a></li>
                    <li><a href="/contact">Контактная информация</a></li>
                </ul>
            <#if user??>
                <li class="navbar-text dropdown pull-right">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Мой профиль<b class="caret"></b></a>
                    <ul id="menu1" class="dropdown-menu">
                        <center><li>Имя пользователя: <b>${user.name}</b></li></center>
                        <li class="divider"></li>
                        <li> 1. ${user.firstThemeAnswerCount}</li>
                        <li> 2. ${user.secondThemeAnswerCount}</li>
                        <li> 3. ${user.thirdThemeAnswerCount}</li>
                        <li> 4. ${user.fourThemeAnswerCount}</li>
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
    <div class="span6 offset3">
        <div class="hero-unit">
            <div align="center">
                <h2><b>Вопрос номер </b> ${taskid}</h2>
                ${task.question}

            </div>
            <br></br>
            <form action="/check" method="post">
                <!--<input type="textarea"  name="answer" placeholder="answer" /> -->
                <!--<p><textarea rows="10" cols="45" name="answer"></textarea></p>-->
                <!--<input type="text" name="answer" placeholder="Введите ответ">-->
                <label class="checkbox">
                    <p>
                        <input type="checkbox" name="answer" value="${task.firstAnswer}" >
                        <b><i>${task.firstAnswer}</i></b>
                    </p>
                </label>
                <label class="checkbox">
                    <p>
                        <input type="checkbox" name="answer" value="${task.secondAnswer}" >
                        <b><i>${task.secondAnswer}</i></b>
                    </p>
                </label>
                <label class="checkbox">
                    <p>
                        <input type="checkbox" name="answer" value="${task.thirdAnswer}" >
                        <b><i>${task.thirdAnswer}</i></b>
                    </p>
                </label>
                <div align="center"><p><input type="submit" value="Проверить" /></p></div>
            </form>
            <br></br><br></br>
            <div align="right">
                <p>Количество правильных ответов ${answercount} </p>
            </div>

        </div>
    </div>
</div><!--/row-->
<!--</div><!--/span-->
<!--</div><!--/row-->

<br></br><br></br>
<hr>
<footer>
    <div align="center"><p><h5>&copy;Michaels Challenger 2017</h5></p>
    </div>
</footer>


<!--</div><!--/.fluid-container-->

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