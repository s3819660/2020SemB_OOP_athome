package wk8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SumTask implements Runnable {
    public Integer sum = 0;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();    // using lock() to synchronize
        try {
            sum += 1;
            //System.out.println(sum + " ");
        }
        finally {
            lock.unlock();
        }
    }
}

public class Q3_Sum {
    public static void main(String[] args) throws InterruptedException {
        SumTask sumTask = new SumTask();

        Thread threads[] = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(sumTask);
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].start();
        }

        // wait for 1000 threads to finish before printing the sum value
        // using join() to wait
        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }

        System.out.println(sumTask.sum);
    }
}
