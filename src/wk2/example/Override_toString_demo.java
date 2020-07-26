package wk2.example;

public class Override_toString_demo {
    public static void main(String[] args) {
        Override_toString p = new Override_toString();
        p.setData("Override");

        System.out.println("p.toString() and p are identical\n"
                            +"p.toString() = " + p.toString());
        System.out.println("p = " + p);

        String something = p + " toString";
        System.out.println("p + toString = " + something);
    }
}
