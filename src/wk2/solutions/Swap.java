package wk2.solutions;

import wk2.example.IntWapper;

public class Swap {

    // doesn't work
//    public static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }

    // doesn't work
    public static void swap(Integer a, Integer b) {
        System.out.println("This method doesn't work");
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void swap(IntWapper a, IntWapper b) {
        System.out.println("This method works");
        int tmp = a.getInteger();
        a.setInteger(b.getInteger());
        b.setInteger(tmp);
    }

    public static void main(String[] args) {
       // swap by value
        int x1 = 1;
        int y1 = 2;

        Swap.swap(x1, y1);

        System.out.println("x = " + x1);
        System.out.println("y = " + y1);

        // swap by class Integer
        Integer x2 = 1;
        Integer y2 = 2;

        Swap.swap(x2, y2);

        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);

        // swap by IntWrapper
        IntWapper intwrapper1 = new IntWapper();
        intwrapper1.setInteger(1);

        IntWapper intwrapper2 = new IntWapper();
        intwrapper2.setInteger(2);

        Swap.swap(intwrapper1, intwrapper2);

        System.out.println("intwrapper1 = " + intwrapper1);
        System.out.println("intwrapper2 = " + intwrapper2);

        System.out.println("intwrapper1.getInteger = " + intwrapper1.getInteger());
        System.out.println("intwrapper2.getInteger = " + intwrapper2.getInteger());
    }
}
