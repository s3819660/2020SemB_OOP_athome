package wk5;

public class Q2_Test1 {
    public static void main(String[] args) {
        int[] list = new int[5];
        try {
            System.out.println(list[5]);
        } catch (Exception e) {
            System.out.println("Array bound = " + (list.length - 1));
            System.out.println("Exception: ");
//            e.printStackTrace();
        }
//        System.out.println("continue");
    }
}
