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
                <h1>Классы и объекты</h1>
                <br></br>
                <small>
                    <p>Java является объектно-ориентированным языком программирования. Как язык, который имеет функцию объектно-ориентирования, он поддерживает следующие основные понятия:</p>
                    <ul>
                        <li>Полиморфизм.</li>
                        <li>Наследование.</li>
                        <li>Инкапсуляция.</li>
                        <li>Абстракция.</li>
                        <li>Классы.</li>
                        <li>Объекты.</li>
                        <li>Экземпляр.</li>
                        <li>Метод.</li>
                        <li>Парсинг.</li>
                    </ul>
                    <p>В этой главе мы рассмотрим <strong>объекты и классы в Java</strong>, их концепции.</p>
                    <p>Класс может быть определен как шаблон (обозначен зеленым цветом), который описывает поведение объекта, который в свою очередь имеет состояние и поведение. Он является экземпляром класса. Например: собака может иметь состояние - цвет, имя, а также и поведение - кивать, лаить, есть.</p>
                    <h2 id="0">Объекты в Java</h2>
                    <p>Давайте теперь посмотрим вглубь, что является объектами. Если мы рассмотрим реальный мир, то найдём много предметов вокруг нас, автомобили, собаки, люди, и т.д. Все они имеют состояние и образ жизни.</p>
                    <p>Если учесть, собаку, то ее состояние - имя, порода, цвет, а образ жизни - лай, виляние хвостом, бег.</p>
                    <p>Если сравнить программный объект в Java с предметов из реального мира, то они имеют очень схожие характеристики, у них также есть состояние и поведение. Программное состояние хранят в полях, а поведение отображается через методы.</p>
                    <p>Таким образом, в разработке программного обеспечения, методы работают на внутреннем состоянии объекта, а связи с другими, осуществляется с помощью методов.</p>
                    <h2 id="1">Классы в Java</h2>
                    <p>Класс, из которого создаются отдельные объекты, обозначен зеленым цветом.</p>
                    <p>Пример создания класса в Java, приводится ниже:</p>
                    <pre><code class="java">public class Dog{
   String breed;
   int age;
   String color;

   void barking(){
   }

   void hungry(){
   }

   void sleeping(){
   }
}
</code></pre>
                    <p>Класс может содержать любой из следующих видов переменных:</p>
                    <ul><li>Локальные переменные, определенные внутри методов, конструкторов или блоков. Они будут объявлены и инициализированы в методе, и будут уничтожены, когда метод завершится.</li>
                        <li>Переменные экземпляра являются переменными в пределах класса, но и снаружи любого метода. Они инициализируются при загрузке. Переменные экземпляра могут быть доступны из внутри любого метода, конструктора или блоков этого конкретного класса.</li>
                        <li>Переменные класса или статические переменные класса в Java объявляются в классе вне любого метода с помощью статического ключевого слова.</li></ul>
                    <p>В Java классы могут иметь любое количество методов для доступа к значению различных видов методов. В приведенном выше примере, barking(), hungry() и sleeping() являются методами.</p>
                    <p>Далее упомянуты некоторые из важных тем, которые должны быть рассмотрены для понимания значения классов и объектов в языке программирования.</p>
                    <h2 id="2">Конструктор класса</h2>
                    <p>При обсуждении вопроса класса, одной из наиболее важных подтем в Java является конструктор. Каждый класс имеет конструктор. Если мы не напишем его или, например, забудем, компилятор создаст его по умолчанию для этого класса.</p>
                    <p>Каждый раз, когда в <strong>Java создается новый объект</strong>, будет вызываться по меньшей мере один конструктор. Главное правило является то, что они должны иметь то же имя, что и класс, который может иметь более одного конструктора.</p>
                    <p>Пример конструктора приведен ниже:</p>
                    <pre><code class="java">public class Puppy{
   public Puppy(){
   }

   public Puppy(String name){
      // Так выглядит конструктор в Java и у него один параметр, name.
   }
}
</code></pre>
                    <strong>Примечание:</strong> в следующих разделах мы будем более подробно обсуждать, если у нас будет два разных типа конструкторов.
                    <h2 id="3">Создание объекта</h2>
                    <p>Варианты <strong>как создать объект в классе</strong> следующие:</p>
                    <ul>
                        <li><strong>Объявление</strong>: объявление переменной с именем переменной с типом объекта.</li>
                        <li><strong>Инстанцирование</strong>: используется «новое» ключевое слово.</li>
                        <li><strong>Инициализация</strong>: «новое» ключевое слово сопровождается вызовом конструктора. Этот вызов инициализирует новый объект.</li>
                    </ul>
                    <p>Пример приводится ниже:</p>
                    <pre><code class="java">public class Puppy{

   public Puppy(String name){
      // Это конструктор и у него один параметр, name.
      System.out.println("Передаваемое имя:" + name );
   }
   public static void main(String []args){
      // Создание объекта myPuppy.
      Puppy myPuppy = new Puppy( "Багет" );
   }
}
</code></pre>
                    <p>Если Вы скомпилируете и запустите выше программу, то она выдаст следующий результат:</p>
                    <pre><code class="html">Передаваемое имя: Багет
</code></pre>
                    <h2 id="4">Доступ к переменным экземпляра и методам в Java</h2>
                    <p>Переменные и методы доступны через созданные объекты. Чтобы получить доступ к переменной экземпляра, полный путь должен выглядеть следующим образом::</p>
                    <pre><code class="java">/* Сначала создайте объект */
ObjectReference = new Constructor();

/* Теперь вызовите переменную следующим образом */
ObjectReference.variableName;

/* Теперь Вы можете вызвать метод класса */
ObjectReference.MethodName();
</code></pre>
                    <h3>Пример</h3>
                    <p>Этот пример объясняет, как получить доступ к переменные экземпляра и методам класса в Java:</p>
                    <pre><code class="java">public class Puppy{

   int puppyAge;

   public Puppy(String name){
      // Это конструктор и у него один параметр, name.
      System.out.println("Передаваемое имя:" + name );
   }
   public void setAge( int age ){
       puppyAge = age;
   }

   public int getAge( ){
       System.out.println("Возраст щенка:" + puppyAge );
       return puppyAge;
   }
   public static void main(String []args){
      /* Создание объекта. */
      Puppy myPuppy = new Puppy( "Багет" );

      /* Вызов метод класса, чтобы установить возраст щенка. */
      myPuppy.setAge( 2 );

      /* Вызов другого метода класса, чтобы получить возраст щенка. */
      myPuppy.getAge( );

      /* Получение переменной экземпляра класса. */
      System.out.println("Значение переменной:" + myPuppy.puppyAge );
   }
}
</code></pre>
                    <p>Если Вы скомпилируете и запустите выше программу, то она выдаст следующий результат:</p>
                    <pre><code class="html">Передаваемое имя: Багет
Возраст щенка: 2
Значение переменной: 2
</code></pre>
                    <h2 id="5">Правила объявления классов, операторов импорта и пакетов в исходном файле</h2>
                    <p>В последней части этого раздела давайте рассмотрим правила декларации исходного файла. Эти правила в Java имеют важное значение при объявлении классов, операторов импорта и операторов пакета в исходном файле.</p>
                    <ul>
                        <li>В исходном файле может быть только один публичный класс (public class).</li>
                        <li>Исходный файл может иметь несколько "непубличных" классов.</li>
                        <li>Название публичного класса должно совпадать с именем исходного файла, который должен иметь расширение <strong>.java</strong> в конце. Например: имя класса <em>public class Employee{}</em>, то исходный файл должен быть <em>Employee.java</em>.</li>
                        <li>Если класс определен внутри пакета, то оператор пакет должно быть первым оператором в исходном файле.</li>
                        <li>Если присутствуют операторы импорта, то они должны быть написаны между операторами пакета и объявлением класса. Если нет никаких операторов пакета, то оператор импорта должен быть первой строкой в исходном файле.</li>
                        <li>Операторы импорта и пакета будут одинаково выполняться для всех классов, присутствующих в исходном файле. В Java не представляется возможным объявить различные операторы импорта и/или пакета к различным классам в исходном файле.</li>
                    </ul>
                    <p>Классы имеют несколько уровней доступа и существуют различные типы классов: абстрактные классы (abstract class), конечные классы (final class) и т.д. Обо всем этом обсудим в разделе <a href="http://proglang.su/java/143" title="Модификаторы доступа в Java">модификаторы доступа</a>.</p>
                    <p>Помимо указанных выше типов классов, Java также имеет некоторые специальные классы, называемые внутренние (Inner class) и анонимные классы (Anonymous class).
                    <h2 id="6">Java пакет (package)</h2>
                    <p>При разработке приложений сотни классов и интерфейсов будет написано, поэтому категоризации этих классов является обязательным, а также это делает жизнь намного проще.</p>
                    <h2 id="7">Операторы импорта (import)</h2>
                    <p>Если задать полное имя, которое включает в себя пакет и имя класса, то компилятор может легко найти исходный код или классы. В Java импорт это способ задать правильное место для компилятора, чтобы найти конкретный класс.</p>
                    <p>Например, следующая строка будет просить компилятор загрузить все классы, доступные в каталоге «java_installation/java/io»:</p>
                    <pre><code class="java">import java.io.*;
</code></pre>
                    <h2 id="8">Простой пример по выше описанному</h2>
                    <p>Для нашего обучения создадим два класса. Это будут классы Employee и EmployeeTest.</p>
                    <p>Для начала откройте блокнот и добавьте следующий код. Помните, что этот класс Employee является открытым или публичным классом. Теперь сохраните исходный файл с именем Employee.java.</p>
                    <p>Класс Employee имеет четыре переменных экземпляра name, age, designation и salary. Он имеет один явно определенный конструктор, который принимает параметр.</p>
                    <pre><code class="java">import java.io.*;
public class Employee{
   String name;
   int age;
   String designation;
   double salary;

   // Это конструктор класса Employee.
   public Employee(String name){
      this.name = name;
   }
   // Присвоение возраста работника переменной age.
   public void empAge(int empAge){
      age =  empAge;
   }
   /* Присвоение переменной designation. */
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
   /* Присвоение переменной salary. */
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   /* Вывод подробной информации. */
   public void printEmployee(){
      System.out.println("Имя:"+ name );
      System.out.println("Возраст:" + age );
      System.out.println("Наименование:" + designation );
      System.out.println("Заработная плата:" + salary);
   }
}
</code></pre>
                    <p>Как упоминалось выше, обработка начинается с основного метода. Поэтому для нас, чтобы запустить класс Employee, должен быть главный метод и созданные объекты. Создадим отдельный класс для этих задач.</p>
                    <p>Ниже приводится класс EmployeeTest, в котором создаются два экземпляра класса Employee и вызывают методы для каждого объекта, для присвоения значений каждой переменной.</p>
                    <p>Сохраните следующий код в файл «EmployeeTest.java»:</p>
                    <pre><code class="java">import java.io.*;
public class EmployeeTest{

   public static void main(String args[]){
      /* Создание двух объектов с помощью конструктора. */
      Employee empOne = new Employee("Олег Олегов");
      Employee empTwo = new Employee("Иван Иванов");

      // Вызов метода для каждого созданного объекта.
      empOne.empAge(26);
      empOne.empDesignation("Старший инженер-программист");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Инженер-программист");
      empTwo.empSalary(500);
      empTwo.printEmployee();
   }
}
</code></pre>
                    <p>Теперь, скомпилировав оба класса, запустим EmployeeTest и получим следующий результат:</p>
                    <pre><code class="html">C:> javac Employee.java
C:> vi EmployeeTest.java
C:> javac EmployeeTest.java
C:> java EmployeeTest
Имя: Олег Олегов
Возраст: 26
Наименование: Старший инженер-программист
Заработная плата: 1000.0
Имя: Иван Иванов
Возраст: 21
Наименование: Инженер-программист
Заработная плата: 500.0
</code></pre>

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