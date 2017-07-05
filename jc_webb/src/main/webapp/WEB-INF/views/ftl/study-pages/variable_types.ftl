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
                <h3>Типы переменных: локальные переменные, переменные экземпляра, статические переменные</h3>
                <br></br>
                <small>
                    <p>Переменная предоставляется нам именем хранения, чтобы нашей программой можно было манипулировать. Каждая переменная в Java имеет конкретный тип, который определяет размер и размещение её в памяти; диапазон значений, которые могут храниться в памяти; и набор операций, которые могут быть применены к переменной.</p>
                    <p>Необходимо объявить все переменные, прежде чем их использовать. Ниже показана основная форма объявления:</p>
                    <pre><code class="html">data type variable [ = value][, variable [= value] ...] ;</code></pre>
                    <p>Здесь data type является одним из типов данных в Java, а «variable» - это имя переменной, «value» - значение. Чтобы объявить более чем одну переменную указанного типа, можно использовать список с запятыми в качестве разделителей. </p>
                    <p>Ниже приведены примеры объявления переменной и инициализации в Java: </p>
                    <pre><code class="java">int a, b, c;         // Объявляет три целых a, b, и c.
int a = 10, b = 10;  // Пример инициализации.
byte b = 22;         // Инициализация переменной b типа byte.
double pi = 3.14159; // Объявление и присвоение величины pi.
char a = 'a';        // Переменная char a присваивает значением 'a'. </code></pre>
                    <p>В этом разделе рассмотрим различные типы переменных, доступных в языке Java. Существует <strong>три типа переменных</strong>: </p>
                    <ul><li>локальные переменные;</li>
                        <li>переменные экземпляра;</li>
                        <li>статические переменные или переменные класса.</li></ul>
                    <h2 id="0">Локальные переменные в Java</h2>
                    <ul><li>Локальные переменные объявляются в методах, конструкторах или блоках.</li>
                        <li>Локальные переменные создаются, когда метод, конструктор или блок запускается и уничтожаются после того, как завершиться метод, конструктор или блок.</li>
                        <li><a href="http://proglang.su/java/143" title="Модификаторы доступа в Java">Модификаторы доступа</a> нельзя использовать для локальных переменных.</li>
                        <li>Они являются видимыми только в пределах объявленного метода, конструктора или блока.</li>
                        <li>Локальные переменные реализуются на уровне стека внутри.</li>
                        <li><strong>В Java не существует для локальных переменных значения по умолчанию</strong>, так что они должны быть объявлены и начальное значение должны быть присвоено перед первым использованием.</li></ul>
                    <h3>Пример использования локальной переменной</h3>
                    <p>Здесь «age» – это локальная переменная. Это определяется внутри метода «pupAge()» и области её действия ограничивается только этим методом.</p>
                    <pre><code class="java">public class Test{
   public void pupAge(){
      int age = 0;
      age = age + 7;
      System.out.println("Возраст щенка: " + age);
   }

   public static void main(String args[]){
      Test test = new Test();
      test.pupAge();
   }
}</code></pre>
                    <p>Будет получен следующий результат:</p>
                    <pre><code class="html">Возраст щенка: 7</code></pre>
                    <h3>Пример без инициализации</h3>
                    <p>Пример использования «age» без инициализации.  Программа выдаст ошибку во время компиляции.</p>
                    <pre><code class="java">public class Test{
   public void pupAge(){
      int age;
      age = age + 7;
      System.out.println("Возраст щенка: " + age);
   }

   public static void main(String args[]){
      Test test = new Test();
      test.pupAge();
   }
}</code></pre>
                    <p>Это приведёт к следующему сообщению об ошибке во время компиляции:</p>
                    <pre><code class="html">Test.java:4:variable number might not have been initialized
age = age + 7;
         ^
1 error</code></pre>
                    <br></br>
                    <h2 id="1">Переменные экземпляра</h2>
                    <ul><li>Переменные экземпляра объявляются в классе, но за пределами метода, конструктора или какого-либо блока. </li>
                        <li>Когда для объекта в стеке выделяется пространство, создается слот для каждого значения переменной экземпляра. </li>
                        <li><strong>В Java переменные экземпляра</strong> создаются тогда, когда объект создан с помощью <a href="http://proglang.su/java/7" title="Ключевые слова, используемые языком Java">ключевого слова «new»</a> и разрушаются тогда, когда объект уничтожается. </li>
                        <li>Переменные содержат значения, которые должны ссылаться более чем на один метод, конструктор или блок, или на основные части состояния объекта, которые должны присутствовать на протяжении всего класса. </li>
                        <li>Переменные экземпляра могут быть объявлен на уровне класса, до или после использования. </li>
                        <li>Модификаторы доступа могут быть предоставлены для переменных экземпляра. </li>
                        <li>Переменные экземпляра в Java являются видимыми для всех методов, конструкторов и блоков в классе. Как правило рекомендуется сделать их private (уровень доступа). Однако можно сделать их видимыми для подклассов этих переменных с помощью модификаторов доступа. </li>
                        <li>Переменные экземпляра имеют значения по умолчанию. Для чисел по умолчанию равно 0, для логических – false, для ссылок на объект - null. Значения могут быть присвоены при объявлении или в конструкторе.</li>
                        <li><strong>Переменные экземпляра в Java</strong> могут быть доступны непосредственно путем вызова имени переменной внутри класса. Однако в статических методах и различных класса (когда к переменным экземпляра дана доступность) должны быть вызваны используя полное имя – <i>ObjectReference.VariableName</i>.</li></ul>
                    <h3>Пример использования</h3>
                    <pre><code class="java">import java.io.*;

public class Employee{
   // Переменная экземпляра открыта для любого дочернего класса.
   public String name;

   // Переменная salary видна только в Employee.
   private double salary;

   // Имя переменной присваивается в конструкторе.
   public Employee (String empName){
      name = empName;
   }

   // Переменной salary присваивается значение.
   public void setSalary(double empSal){
      salary = empSal;
   }

   // Этот метод выводит на экран данные сотрудников.
   public void printEmp(){
      System.out.println("имя: " + name );
      System.out.println("зарплата:" + salary);
   }

   public static void main(String args[]){
      Employee empOne = new Employee("Олег");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}</code></pre>
                    <p>Программа будет будет производить следующий результат:</p>
                    <pre><code class="html">имя: Олег
зарплата: 1000.0</code></pre>
                    <br></br>
                    <h2 id="2">Переменные класса или статические переменные в Java</h2>
                    <ul>
                        <li><strong>Переменные класса, также известные в Java как статические переменные</strong>, которые объявляются со статическим ключевым слово в классе, но за пределами метода, конструктора или блока.</li>
                        <li>Там будет только одна копия каждой статической переменной в классе, независимо от того, сколько объектов создано из него. </li>
                        <li>Статические переменные или переменные класса в Java используются редко, кроме когда объявляются как константы. Константы - переменные, которые объявлены как public/private, final и static. Константы никогда не меняются от первоначального значения.</li>
                        <li>В Java статические переменные создаются при запуске программы и уничтожаются, когда выполнение программы остановится. </li>
                        <li>Видимость похожа на переменную экземпляра. Однако большинство статических переменных объявляются как public, поскольку они должны быть доступны для пользователей класса. </li>
                        <li>Значения по умолчанию такое же, как и у переменных экземпляра. Для чисел по умолчанию равно 0, для данных типа Boolean - false; и для ссылок на объект - null. Значения могут быть присвоены при объявлении или в конструкторе. Кроме того, они могут быть присвоены в специальных блоках статического инициализатора. </li>
                        <li>Статические переменные могут быть доступны посредством вызова с именем класса <i>ClassName.VariableName</i>.</li>
                        <li>При объявлении переменных класса как public, static, final, имена находятся в верхнем регистре. Если статические переменные такими не являются, синтаксис такой же, как у переменных экземпляра и локальных.</li></ul>
                    <h3>Пример статических переменных или переменных класса</h3>
                    <pre><code class="java">import java.io.*;

public class Employee{
   // salary(зарплата) переменная private static
   private static double salary;

   // DEPARTMENT(отдел) – это константа
   public static final String DEPARTMENT = "Разработка ";

   public static void main(String args[]){
      salary = 1000;
      System.out.println(DEPARTMENT+"средняя зарплата: "+salary);
   }
}
</code></pre>
                    <p>Это будет производить следующий результат:</p>
                    <pre><code class="html">Разработка средняя зарплата: 1000</code></pre>
                    <p><strong>Примечание:</strong> для получения доступа из внешнего класса, константы должны быть доступны как Employee.DEPARTMENT.</p>
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