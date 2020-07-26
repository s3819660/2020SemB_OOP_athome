package wk2.example;
import wk1.packagedemo.*;

public class ArrayOfObjects {
    public static void main(StringCompare[] args) {
        // array of characters
        char[] arrayOfCharacter = new char[100]; //

        // array of strings
        StringCompare[] arrayOfStrings = new StringCompare[100];

        // array of objects
        Person[] arrayOfPersons = new Person[100];

        // each object is a different variable
        arrayOfPersons[0] = new Student();
        arrayOfPersons[1] = new Teacher();

        // array of integers
        int[] ints = {1, 2, 3};
        int[] ints2 = new int[3];
    }
}
