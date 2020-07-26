package wk1.solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Circle {
    double x;
    double y;
    double r;

    public Circle(Scanner scanner) {
        // regex String
        String regex = "^(?<xpattern>-?\\d+(.\\d+)?)\\s(?<ypattern>-?\\d+(.\\d+)?)\\s(?<rpattern>\\d+(.\\d+)?)$";
        Pattern pattern = Pattern.compile(regex);

        boolean bool = false;
        while (!bool) {

            // matching regex
            String input = scanner.nextLine();  // every time scanner or its method is called,
                                                // the program will buffer again
                                                // so we will have to initialize an input variable to use many times

            Matcher matcher = pattern.matcher(input);
//            bool = Pattern.compile(regex).matcher(input).matches(); / this doesn't need a pattern and a matcher variable
            bool = matcher.matches();

            // check if input matches with given pattern
            if (!bool) {
                System.out.println("Wrong input\nPlease enter again: ");
            }

            // get strings of x, y and r from groups of pattern
            String xString = matcher.group("xpattern");
            String yString = matcher.group("ypattern");
            String rString = matcher.group("rpattern");

            // convert strings x, y and r to primitive datatype double
            this.x = Double.parseDouble(xString);
            this.y = Double.parseDouble(yString);
            this.r = Double.parseDouble(rString);
        }
    }

    // getX
    public double getX() {
        return x;
    }

    // getY
    public double getY() {
        return y;
    }

    // getR
    public double getR() {
        return r;
    }
}

public class Circles {

    static double getDistance(Circle c1, Circle c2) {
        return Math.sqrt(Math.pow(Math.abs(c2.getX() - c1.getX()), 2) + Math.pow(Math.abs(c2.getY() - c1.getY()), 2));
    }

    static void getCirclesRelation(Circle c1, Circle c2) {
        double distance = getDistance(c1, c2);
        if (distance <= Math.abs(c1.getR() - c2.getR()))
            System.out.println("circle 2 is inside circle 1");
        else if (distance <= c1.getR() + c2.getR())
            System.out.println("circle 2 overlaps circle 1");
        else if (distance == c1.getR() + c2.getR())
            System.out.println("circle 1 touches circle 2");
        else if (distance > c1.getR() + c2.getR())
            System.out.println("circle 1 doesn't intersect circle 2");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt user to enter x and y coordinates of circle 1's center and its radius
        System.out.println("circle 1 center x and y and radius: ");
        Circle c1 = new Circle(scanner);

        // prompt user to enter x and y coordinates of circle 2's center and its radius
        System.out.println("circle 2 center x and y and radius: ");
        Circle c2 = new Circle(scanner);

        getCirclesRelation(c1, c2);
    }
}
