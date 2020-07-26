package wk3;

import java.util.Scanner;

class C {
    int p;
    public void setP(int p) {
        this.p = p;
    }

    public int getP() {
        return p;
    }
}

public class Q2_Setter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        C c = new C();
        c.setP(scanner.nextInt());
        System.out.println(c.getP());
    }
}
