package wk8;

class PrintChar implements Runnable {
    int times;
    char charToPrint;

    public PrintChar(char ch, int n) {
        this.times = n;
        this.charToPrint = ch;
    }

    @Override
    public void run() {
        for(int i = 0; i < this.times; i++) {
            System.out.print(charToPrint);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.lastNum; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading_demo1 {
    public static void main(String[] args) throws InterruptedException {
        PrintChar printA = new PrintChar('a', 10);
        PrintChar printB = new PrintChar('b', 10);
        PrintNum printNum = new PrintNum(10);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printNum);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
