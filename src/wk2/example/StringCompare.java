package wk2.example;

public class StringCompare {
    public static void main(String[] args) {

        java.lang.String s1 = new java.lang.String("abc");
        java.lang.String s2 = new java.lang.String("abc");


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        java.lang.String s = "Hello World!";
        int len = s.length();
        System.out.println("Index\tCharacter");
        for (int i = 0; i < len; i++)
            System.out.println(i + "\t\t" + s.charAt(i));

        System.out.println("something");
    }
}
