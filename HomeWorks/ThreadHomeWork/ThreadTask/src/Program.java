import java.util.Random;
import java.util.Scanner;

/**
 * Created by Michael on 17.06.2017.
 */
public class Program {
    static int[] array;
    static int sum = 0;
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           Random random = new Random();
           System.out.println("Введите n - размерность массива:");
           int n = scanner.nextInt();
           System.out.println("Введите k - количество потоков:");
           int k = scanner.nextInt();
           array = new int[n];
           for ( int i = 0; i < array.length; i++){
               array[i] = random.nextInt(100);
           }
           for (int l = 0; l < array.length; l++){
               System.out.println(array[l]);
               sum += array[l];
           }
        System.out.println("Сумма = " + sum);

           Summary summary = new Summary();
           for (int j = 0; j < k ; j++){
               if ( j == k - 1) {
                   int start = (k - 1) * (n / k);
                   int end = n;
                   MyThread thread = new MyThread(start, end, array, summary);
                   thread.start();
                   try {
                       thread.join();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               else{
                   MyThread thread = new MyThread(j,n,k, array, summary);
                   thread.start();
                   try {
                       thread.join();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }

           }
        System.out.println("Summa = " + summary.getSum());

    }
}
