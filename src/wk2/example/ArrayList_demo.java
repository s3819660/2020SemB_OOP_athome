package wk2.example;
import wk1.packagedemo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_demo {
    public static void main(StringCompare[] args) {
        ArrayList<Person> list1 = new ArrayList<Person>(); // Person is a non-primitive variable
        ArrayList<Person> list2 = new ArrayList(2);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int age = scanner.nextInt();
            list2.add(new Person(age));
        }
        
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i).getAge());
//        }

        for (Person person : list2) {
            System.out.println(person.getAge());
        }
    }
}