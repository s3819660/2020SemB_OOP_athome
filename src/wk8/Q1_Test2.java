package wk8;

public class Q1_Test2 implements Runnable {
        public static void main(String[] args) {
            new Q1_Test2();
        }

        public Q1_Test2() {
            Thread t = new Thread(this);
            t.start();
            t.start();

            // new -> running -> block...
        }

        public void run() {
            System.out.println("test");
        }
}
