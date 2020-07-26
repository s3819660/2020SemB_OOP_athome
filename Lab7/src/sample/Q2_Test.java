package sample;

// purpose: high order function
// high order function is a function which its parameter is another function
//
public class Q2_Test {
    public static void main(String[] args) {
        Q2_Test test = new Q2_Test();
        // lambda method to override Interface
        test.setAction1(() -> System.out.print("Action 1! "));  // Action 1!

        // regular method to override Interface
//        test.setAction1(new T1() {
//            @Override
//            public void m() {
//                System.out.print("Action 1! ");
//            }
//        });

        test.setAction2(e -> System.out.print(e + " "));        // 4.5

//        test.setAction2(new T2() {
//            @Override
//            public void m(Double e) {
//                System.out.print(e + " ");
//            }
//        });

        System.out.println(test.setAction3(e -> e * 2));        // 11
    }

    public void setAction1(T1 t) {
        t.m();
    }

    public void setAction2(T2 t) {
        t.m(4.5);
    }

    public double setAction3(T3 t) {
        return t.m(5.5);
    }
}

interface T1 {          // T1 is actually a function set
    public void m();
}

interface T2 {
    public void m(Double d);
}

interface T3 {
    public double m(Double d);
}
