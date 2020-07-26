package wk8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyInt {
    public long number;

    public MyInt() {
        this.number = 0;
    }
}

class TheTask implements Runnable {
    MyInt theInt;
    static Lock lock = new ReentrantLock();

    public TheTask(MyInt theInt) {
        this.theInt = theInt;
    }

    @Override
    public void run() {
        while (true)
        {
            /*
            theInt.number = theInt.number + 1;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(theInt.number + " ");
             */

            lock.lock();
            try {
                theInt.number = theInt.number + 1;
                Thread.sleep(500);
                System.out.print(theInt.number + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        MyInt theIn = new MyInt(); // theInt is the shared resource

        TheTask task1 = new TheTask(theIn);
        TheTask task2 = new TheTask(theIn);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
