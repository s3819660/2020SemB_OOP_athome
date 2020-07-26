package wk8;

public class Q1_Test1 implements Runnable {
        public static void main(String[] args) {
            new Q1_Test1();
        }

        public Q1_Test1() {
            Q1_Test1 task = new Q1_Test1();
            new Thread(task).start(); // thread.run
        }

        public void run() {
            System.out.println("test");
        }
}

// main -> new Q1 -> new Q1 -> new Q1 -> new Q1
