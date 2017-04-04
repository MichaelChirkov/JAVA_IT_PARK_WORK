
 // Created by Michael on 02.04.2017.

import java.util.Random;
import java.util.Scanner;
import java.util.Date;
public class Program {

   public static double function2 (double x){
       return ( -0.5*x*x + 6*x + 1);
   }

    public static double function1 (double newArray[], int B, int A){
        double AMOUNT = 0;
        for (int k = 0; k < newArray.length; k++ ){
            AMOUNT += function2(newArray[k]);
        }
       return (((double)(B - A))/(double)newArray.length) * AMOUNT;
    }

    public static void main (String[] args){
        int q = 4093, w = 110101, m = 524288; // для генерации случ числа
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int N,a,b;
        System.out.println("Введите количество точек (N) : ");
        N = scanner.nextInt();
        System.out.println("Введите границы a и b:");
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.println();

        double[] array = new double[N];
        for (int i = 0; i < array.length; i++){
           array[i] = random.nextDouble();
        }

        for ( int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println(function1(array,b,a));

    }
}
