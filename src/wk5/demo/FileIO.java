package wk5.demo;

import java.io.PrintWriter;

public class FileIO {

    public static void main(String[] args) throws Exception {
        java.io.File file1 = new java.io.File("scores.txt");
        java.io.File file2 = new java.io.File("names.txt");
        try (java.io.PrintWriter output1 = new java.io.PrintWriter(file1);
             PrintWriter output2 = new PrintWriter(file2))
        {
            output1.print("John T Smith ");
            output1.println(90);
            output1.print("Eric K Jones ");
            output1.println(85);
        }
    }

}
