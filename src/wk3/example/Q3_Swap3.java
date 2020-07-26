package wk3.example;

public class Q3_Swap3 {
    public static void main(String[] args) {

        /**
         * non-primitive data types are called REFERENCE DATA TYPE
         */
        A a = new A();
        swap(a);
        System.out.println("e1 = " + a.e1
                + " e2 = " + a.e2);
    }
    public static void swap(A a) {
        int temp = a.e1;
        a.e1 = a.e2;
        a.e2 = temp;
    }
}
class A {
    int e1 = 1;
    int e2 = 2;
}
