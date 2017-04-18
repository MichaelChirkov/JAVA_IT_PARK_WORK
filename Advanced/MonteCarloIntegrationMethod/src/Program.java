
 // Created by Salakhova A. on 02.04.2017.

import java.util.Random; //импортируем класс Random с помощью которого мы будем генерировать случайные числа
import java.util.Scanner; // этот класс нужен чтобы осуществлять ввод.

public class Program {


    public static void main (String[] args){ // точка входа в программу
       
        Random random = new Random(); //Создаем объект класса Random
        Scanner scanner = new Scanner(System.in); //создаем объект класса Scanner
        int N, AMOUNT = 0;
        double a = 0, b = 12.0; //
        System.out.println("Введите количество точек (N) : ");
        N = scanner.nextInt(); // Вводим с клавиатуры количество случайных точек
        System.out.println();


        double[] array = new double[N]; //Объявляю массив типа double с размером N
        for (int i = 0; i < array.length; i++){ //заполнение массива случайными числами
           array[i] = a + (b-a)*random.nextDouble();
            AMOUNT += -0.5*array[i]*array[i] + 6*array[i] + 1; //в сумму прибавляем значение g(x) где х - текущее случайное число
        }

        System.out.println("Последовательность случайных чисел:");
        for ( int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат работы программы");
        System.out.println((((b - a))/(double)array.length) * AMOUNT); //печатаем на экран значение полученное при вычислении методом интергирования Монте-Карло
        System.out.println();



    }
}
