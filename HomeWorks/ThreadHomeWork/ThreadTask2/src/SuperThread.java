import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Michael on 17.06.2017.
 */
public class SuperThread implements Callable {
    private int start, end;
    private int[] array;
    ReentrantLock locker;
    int summary;

    public SuperThread(int i, int n, int k, int[] array, int sum, ReentrantLock locker) {
        this.start = i * (n / k);
        this.end = start + (n / k);
        this.array = array;
        this.summary = sum;
        this.locker = locker;
    }
    public SuperThread(int start, int end, int[] array, int sum, ReentrantLock locker){
        this.start = start;
        this.end = end;
        this.array = array;
        this.summary = sum;
        this.locker = locker;
    }

    @Override
    public Integer call() throws Exception {
        locker.lock();
        try {
            for (int i = start; i < end; i++) {
                summary += array[i];
            }
        }
        finally{
            locker.unlock();
        }
        return summary;
    }
}
