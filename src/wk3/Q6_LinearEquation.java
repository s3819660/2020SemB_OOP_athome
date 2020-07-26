package wk3;

import java.util.Scanner;

class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    /** static methods waste memory
     * @return
     */
    boolean isSolvable() {
        return this.a * this.d - this.b * this.c != 0;
    }

    double getX() {
        return (double)(this.e * this.d - this.b * this.f) / (double)(this.a * this.d - this.b * this.c);
    }

    double getY() {
        return (double)(this.a * this.f - this.e * this.c) / (double)(this.a * this.d - this.b * this.c);
    }
}

public class Q6_LinearEquation {

    static LinearEquation getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        System.out.println("Input c: ");
        int e = scanner.nextInt();
        System.out.println("Input d: ");
        int c = scanner.nextInt();
        System.out.println("Input e: ");
        int d = scanner.nextInt();
        System.out.println("Input f: ");
        int f = scanner.nextInt();
        return new LinearEquation(a, b, c, d, e, f);
    }

    public static void main(String[] args) {
        LinearEquation linearEquation = Q6_LinearEquation.getInput();
        System.out.println(linearEquation.getA() + "\n" +
                           linearEquation.getB() + "\n" +
                           linearEquation.getC() + "\n" +
                           linearEquation.getD() + "\n" +
                           linearEquation.getE() + "\n" +
                           linearEquation.getF());
        if (linearEquation.isSolvable()) {
            System.out.println("x = " + linearEquation.getX() + "\n"
                             + "y = " + linearEquation.getY());
        }
        else
            System.out.println("The equation has no solution");
    }
}
