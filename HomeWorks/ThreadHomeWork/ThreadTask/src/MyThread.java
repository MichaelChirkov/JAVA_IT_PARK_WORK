/**
 * Created by Michael on 17.06.2017.
 */
public class MyThread extends Thread {
    private int start, end;
    private int[] array;
    Summary summary;
    public MyThread(int i, int n, int k, int[] array, Summary sum) {
        this.start = i * (n / k);
        this.end = start + (n / k);
        this.array = array;
        this.summary = sum;
    }
    public MyThread(int start, int end, int[] array, Summary sum){
        this.start = start;
        this.end = end;
        this.array = array;
        this.summary = sum;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            synchronized (summary){
                System.out.println(" Thread name = " + currentThread().getName() + " start = " + start + " end = " + end );
            summary.setSum(summary.getSum() + array[i]);
            }

        }
    }
}
