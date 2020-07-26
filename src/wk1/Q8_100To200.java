package wk1;

public class Q8_100To200 {

    static boolean isValid(int num) {
        if ((num % 5 == 0 && num % 6 != 0) || num % 5 != 0 && num % 6 == 0)
            return true;
        else
            return false;
    }

    static void display100To200() {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (isValid(i) == true) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 10) {
                System.out.print("\n");
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        display100To200();
    }
}
