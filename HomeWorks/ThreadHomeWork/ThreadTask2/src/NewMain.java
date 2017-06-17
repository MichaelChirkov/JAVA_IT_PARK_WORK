import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Michael on 17.06.2017.
 */
public class NewMain {
    static int[] array;
    static int sum = 0;

    public static void main(String[] args) {
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        ReentrantLock locker = new ReentrantLock();

        Random random = new Random();
        System.out.println("Введите n - размерность массива:");
        int n = scanner.nextInt();
        System.out.println("Введите k - количество потоков:");
        int k = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int l = 0; l < array.length; l++) {
            System.out.println(array[l]);
            summ += array[l];
        }
        System.out.println("Сумма = " + summ);


        for (int j = 0; j < k; j++) {
            if (j == k - 1) {
                int start = (k - 1) * (n / k);
                int end = n;
                SuperThread sp = new SuperThread(start, end, array, sum, locker);
                FutureTask<Integer> task = new FutureTask<Integer>(sp);
                Thread t = new Thread(task);
                t.start();
                try {
                    sum = task.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

            } else {
                SuperThread sp = new SuperThread(j, n, k, array, sum, locker);
                FutureTask<Integer> task = new FutureTask<Integer>(sp);
                Thread t = new Thread(task);
                t.start();
                try {
                    sum = task.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Сумма = " + sum);

        }
    }
}
