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
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
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
                        <center>
                            <li>Имя пользователя: <b>${user.name}</b></li>
                        </center>
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
            <div class="hero-unit"><font face="monospace">
                <h1>Типы данных</h1>
                <br></br>
                <small>
                <p>Переменные не что иное как зарезервированные места памяти для хранения значений. Это означает, что при создании переменной Вы резервируете некоторое пространство в памяти.</p>
                <p>Основываясь на типе данных, который присвоен переменной, операционная система выделяет память и решает, что может быть сохранено в зарезервированную памяти. Поэтому, назначая различные типы данных для переменных, в Java можно хранить целые числа, десятичные дроби или символов в этих переменных.</p>
                <p>Существует два типа данных в Java:</p>
                <ul><li>простые или примитивные типы данных;</li>
                    <li>ссылочные типы данных (ссылка/объект).</li></ul>
                <h2 id="0">Примитивные типы данных</h2>
                <p>Есть восемь типов данных, поддерживаемых Java. Основные типы данных, предопределенны языком и названы по <a href="http://proglang.su/java/7" title="50 ключевых слов в Java">ключевому слову</a>. Теперь давайте посмотрим в деталях эти <strong>восемь базовых типов данных</strong> существующих в языке программирования Java.</p>
                <h3>byte:</h3>
                <ul><li>Тип данных byte является 8-разрядным знаковым целым числом.</li>
                    <li>Минимальная величина равна -128 (-2<sup>7</sup>).</li>
                    <li>Максимальное значение равно 127 (включительно) (2<sup>7</sup>-1).</li>
                    <li>По умолчанию – 0.</li>
                    <li>byte предназначен для экономии места в больших массивах, главным образом вместо целых чисел, поскольку byte в четыре раза меньше, чем int.</li>
                    <li>Пример:
                        <pre><code class="java">byte a = 100;
byte b = -50;</code></pre></li></ul>
                <h3>short:</h3>
                <ul><li>Тип данных short является 16-разрядным знаковым целым числом.</li>
                    <li>Минимальное значение равно -32768 (-2<sup>15</sup>).</li>
                    <li>Максимальная величина равна 32 767 (включительно) (2<sup>15</sup>-1).</li>
                    <li>short в Java может также использоваться для экономии памяти как byte. Short в 2 раза меньше, чем int.</li>
                    <li>По умолчанию – 0.</li>
                    <li>Пример:
                        <pre><code class="java">short s = 10000;
short r = -20000;</code></pre></li></ul>
                <h3>int:</h3>
                <ul><li>В языке Java тип данных int является 32-разрядным знаковым целым числом.</li>
                    <li>Минимальное значение - 2 147 483 648 (-2<sup>31</sup>).</li>
                    <li>Максимальная величина равна 2,147,483,647 (включительно)(2<sup>31</sup>-1).</li>
                    <li>int обычно используется для целых значений. Если нет озабоченности по поводу памяти.</li>
                    <li>По умолчанию равно 0.</li>
                    <li>Пример:
                        <pre><code class="java">int a = 100000;
int b =-200000;</code></pre></li></ul>
                <h3>long:</h3>
                <ul><li>Тип данных long является 64-разрядным знаковым целым числом.</li>
                    <li>Минимальное значение равно – 9,223,372,036,854,775,808 (-2<sup>63</sup>).</li>
                    <li>Максимальная величина – 9,223,372,036,854,775,807 (включительно). (2<sup>63</sup>-1).</li>
                    <li>В Java Применяется когда требуется более широкий диапазон, чем int.</li>
                    <li>По умолчанию – 0L.</li>
                    <li>Пример:
                        <pre><code class="java">long a = 100000L;
long b =-200000L;</code></pre></li></ul>
                <h3>float:</h3>
                <ul><li>Тип данных float является c одинарной точностью 32-битный IEEE 754 с плавающей точкой.</li>
                    <li>Float используется главным образом для сохранения памяти в больших массивах чисел с плавающей точкой.</li>
                    <li>По умолчанию – 0.0f.</li>
                    <li>float никогда не должен применяется для точного значения, например, валюты.</li>
                    <li>Пример:
                        <pre><code class="java">float f1 = 234.5f;</code></pre></li></ul>
                <h3>double:</h3>
                <ul><li>Тип данных double является c двойной точностью 64-битный IEEE 754 с плавающей точкой.</li>
                    <li>Обычно используется для десятичных значений.</li>
                    <li>double никогда не должен применяется для точного значения, например, валюты.</li>
                    <li>По умолчанию – 0.0d.</li>
                    <li>Пример:
                        <pre><code class="java">double d1 = 123.4;</code></pre></li></ul>
                <h3>boolean:</h3>
                <ul><li>Тип данных boolean представляет собой один бит информации.</li>
                    <li>Существует только два возможных значения: true и false.</li>
                    <li>Предназначен для простых признаков, которые позволяют отслеживать условия true или false.</li>
                    <li>По умолчанию – false.</li>
                    <li>Пример:
                        <pre><code class="java">boolean one = true;</code></pre></li></ul>
                <h3>char:</h3>
                <ul><li>Тип данных char является одним 16-разрядным символом Юникода.</li>
                    <li>Минимальная величина равна «\u0000» (или 0).</li>
                    <li>Максимальная величина равна «\uffff» (или 65535 включительно).</li>
                    <li>В Java char нужен для хранения любого символа.</li>
                    <li>Пример:
                        <pre><code class="java">char letterA ='A';</code></pre></li></ul>
                <h2 id="1">Ссылочные типы данных</h2>
                <ul><li>Ссылочные переменные создаются с использованием определенных конструкторов классов. Они предназначены для доступа к объектам. Эти переменные объявляются с определенным типом, который не может быть изменен. Например, Employee, Puppy и т.д.</li>
                    <li>Объекты класса и различные виды переменных массива подпадают под <strong>ссылочный тип данных</strong>.</li>
                    <li>По умолчанию в Java значение любой переменной ссылки - null.</li>
                    <li>Ссылочная переменная может применяться для обозначения любого объекта, объявленного или любого совместимого типа.</li>
                    <li>Пример:
                        <pre><code class="java">Animal animal = new Animal("giraffe");</code></pre></li></ul>
                <h2 id="2">Литералы в Java</h2>
                <p>Литерал — представление исходного кода как фиксированное значение. Оно представлено непосредственно в коде без каких-либо вычислений.
                    Литерал в Java можно назначить любой переменной из основного типа. Например:</p>
                <pre><code class="java">byte a = 68;
char a = 'A';</code></pre>
                <p>Byte, int, long, и short может выражаться десятичной (основание 10), шестнадцатеричной (основание 16) или восьмеричной (основание 8) системой исчисления.</p>
                <p>При использовании литералов в Java, префикс 0 применяться для указания восьмеричной системы, а префикс 0x указывает на шестнадцатеричную систему. Например:</p>
                <pre><code class="java">int decimal = 100;
int octal = 0144;
int hexa =  0x64;</code></pre>
                <p>Строковые литералы в языке Java задаются как и в большинстве других языков, заключив последовательность символов между парой двойных кавычек. Примеры строковых литералов:</p>
                <pre><code class="java">"Hello World"
"two\nlines"
"\"This is in quotes\""</code></pre>
                <p>Типы литералов String и char могут содержать любые символы Юникода. Например:</p>
                <pre><code class="java">char a = '\u0001';
String a = "\u0001";</code></pre>
                <p>Язык Java поддерживает несколько специальных управляющих последовательностей для литералов String и char:</p>
                <table>
                    <tr><td>Обозначение</td>
                        <td>Представление</td></tr>
                    <tr><td>\n</td>
                        <td>Новая строка (0x0a)</td></tr>
                    <tr><td>\r</td>
                        <td>Возврат каретки (0x0d)</td></tr>
                    <tr><td>\f</td>
                        <td>Прогон страницы (0x0c)</td></tr>
                    <tr><td>\b</td>
                        <td>Возврат на шаг (0x08)</td></tr>
                    <tr><td>\s</td>
                        <td>пробел (0x20)</td></tr>
                    <tr><td>\t</td>
                        <td>Табуляция</td></tr>
                    <tr><td>\"</td>
                        <td>Двойная кавычка</td></tr>
                    <tr><td>\'</td>
                        <td>Апостроф</td></tr>
                    <tr><td>\\</td>
                        <td>Обратная косая черта</td></tr>
                    <tr><td>\ddd</td>
                        <td>Восьмеричный символ (ddd)</td></tr>
                    <tr><td>\uxxxx</td>
                        <td>Шестнадцатиричный символ UNICODE (xxxx)</td></tr>
                </table></small></font>

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