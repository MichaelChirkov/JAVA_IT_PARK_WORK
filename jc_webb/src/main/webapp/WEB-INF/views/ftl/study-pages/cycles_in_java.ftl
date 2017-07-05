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
            background-color: #b9cbff;
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
                    <li><a href="/tests">Теоретические тесты</a></li>
                    <li><a href="/practic-tests">Практические тесты</a></li>
                    <li><a href=/ranking>Рейтинг</a></li>
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
                <p><h2>Циклы в Java</h2></p>

                <small>
                    <h3>For</h3>

                    Цикл for состоит из трех секций:

                    <pre>
                    for (int i = 0; i < 3; i++) {

                        }
                    1
                    for (int i = 0; i < 3; i++) {

                        }
                        </pre>
                    <br>
                    Первая секция выполняется один раз, когда мы входим в цикл.  В нашем примере здесь задается начальное значение переменной i. Вторая секция проверяет логическое условие, если оно возвращает true, выполняются операторы в цикле, если false, выход из цикла. Вторая секция в первый раз запускается сразу после первой секции, и выполняется каждый раз, пока условие верно, вызывая третью секцию. Третья секция — заключительный оператор, его действие выполняется каждый раз при выполнении цикла. В нашем примере это инкремент, который при каждом выполнении увеличивает значение переменной на единицу.

                    <p>Таким образом, цикл будет работать 3 раза. Вот порядок команд:</p>

                    <pre>
                    int i = 0;
                    i < 3 // 0 < 3 = true
                    // Inside of loop
                    i++ // i is now 1
                    i < 3 // 1 < 3 = true
                    // Inside of loop
                    i++ // i is now 2
                    i < 3 // 2 < 3 = true
                    // Inside of loop
                    i++ // i is now 3
                    i < 3 // 3 < 3 = false
                    // Loop is done...
                    1
                    2
                    3
                    4
                    5
                    6
                    7
                    8
                    9
                    10
                    11
                    12
                    int i = 0;
                    i < 3 // 0 < 3 = true
                    // Inside of loop
                    i++ // i is now 1
                    i < 3 // 1 < 3 = true
                    // Inside of loop
                    i++ // i is now 2
                    i < 3 // 2 < 3 = true
                    // Inside of loop
                    i++ // i is now 3
                    i < 3 // 3 < 3 = false
                    // Loop is done...
                    </pre>
                    <br>
                    Мы можем опустить первую и третью секции цикла (как бы странно это ни выглядело), и цикл все еще будет работать:

                    <pre>
                    for (;i < 5;) {}
                    1
                    for (;i < 5;) {}
                        </pre>
                    <br>
                    Для случаев, где нужно использовать цикл схожих повторяющихся действий, мы используем цикл while
                    <br>
                    <h3>While</h3>
                    Синтаксис похож на предыдущий:

                    <pre>
                    while (condition) {}
                    1
                    while (condition) {}
                        </pre>
                    <br>
                    Условие будет работать впервые при вводе и каждый раз, когда вызывается цикл. Если условие возвратит false, то цикл не будет работать.
                    Если мы хотим, чтобы цикл всегда выполнял по крайней мере одно действие, мы можем использовать do-while:

                    <pre>
                    do {

                    } while(condition);
                    1
                    2
                    3
                    do {

                    } while(condition);
                        </pre>
                    Не забудьте точку с запятой в конце.
                    <br>
                    <h3>Foreach</h3>
                    Другая версия for, это foreach. Но в Java решили не добавлять новое ключевое слово each. Ключевое слово, которое мы используем, все еще for, но когда мы хотим выполнить действия над элементами массива, делаем так:

                    <pre>
                    int[] arr = {2, 0, 1, 3};
                    for (int el : arr) {
                    System.out.println(el);
                    }
                    1
                    2
                    3
                    4
                    int[] arr = {2, 0, 1, 3};
                    for (int el : arr) {
                    System.out.println(el);
                    }
                    </pre>
                    <br>
                    Это была короткая версия, эквивалентная следующей записи:

                    <pre>
                    int[] arr = {1, 9, 9, 5};
                    for (int i = 0; i < arr.length; i++) {
                    int el = arr[i];
                    System.out.println(el);
                    }
                    1
                    2
                    3
                    4
                    5
                    int[] arr = {1, 9, 9, 5};
                    for (int i = 0; i < arr.length; i++) {
                    int el = arr[i];
                    System.out.println(el);
                    }
                    </pre>
                    Заметьте, что, если вы хотите использовать индекс элемента в цикле, Вы должны использовать более длинную версию и не можете использовать foreach.
                    <br>
                    <h3><b>break</b> и <b>continue</b></h3>
                    Эти два ключевых слова помогают нам управлять циклом из него. Оператор break останавливает цикл и переходит к оператору, следующему за ним:

                    <pre>
                    int i;
                    for (i = 0; i < 5; i++) {
                    if (i >= 2) {
                    break;
                    }
                    System.out.println("Yuhu");
                    }
                    System.out.println(i);
                    // Output:
                    // Yuhu
                    // Yuhu
                    // 2
                    1
                    2
                    3
                    4
                    5
                    6
                    7
                    8
                    9
                    10
                    11
                    12
                    int i;
                    for (i = 0; i < 5; i++) {
                    if (i >= 2) {
                    break;
                    }
                    System.out.println("Yuhu");
                    }
                    System.out.println(i);
                    // Output:
                    // Yuhu
                    // Yuhu
                    // 2
                    </pre>
                    <br>
                    Оператор <i>continue</i> остановит текущую итерацию и переместится в следующую. Заметьте, что в цикле for действие в третьей секции будет выполнено при этом.

                    <pre>
                    int i;
                    for (i = 0; i < 5; i++) {
                    if (i >= 3) {
                    break;
                    }
                    System.out.println("Yuhu");
                    if (i >= 1) {
                    continue;
                    }
                    System.out.println("Tata");
                    }
                    System.out.println(i);
                    // Output
                    // Yuhu
                    // Tata
                    // Yuhu
                    // Yuhu
                    // 3
                    1
                    2
                    3
                    4
                    5
                    6
                    7
                    8
                    9
                    10
                    11
                    12
                    13
                    14
                    15
                    16
                    17
                    18
                    int i;
                    for (i = 0; i < 5; i++) {
                    if (i >= 3) {
                    break;
                    }
                    System.out.println("Yuhu");
                    if (i >= 1) {
                    continue;
                    }
                    System.out.println("Tata");
                    }
                    System.out.println(i);
                    // Output
                    // Yuhu
                    // Tata
                    // Yuhu
                    // Yuhu
                    // 3
                    </pre>
                </small>

            </div>
        </div><!--/row-->
    </div><!--/span-->
</div><!--/row-->

<footer>
    <div align="center"><p><h5>&copy;       Michaels Challenger 2017</h5></p></div>
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