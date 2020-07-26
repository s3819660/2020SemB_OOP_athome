package wk3;

import java.text.DecimalFormat;

class Rectangle {
    protected double width = 1;
    protected double height = 1;

    /**
     * no need to write a no-arg constructor that creates a default rectangle
     */

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static double getArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double getPerimeter(Rectangle rectangle) {
        return 2 * rectangle.getWidth() + 2 * rectangle.getHeight();
    }

    public static void displayValue() {

        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        /**
         *  ROUND DECIMAL
         */
        DecimalFormat decimalFormat = new DecimalFormat("####.##");

        System.out.println("Rectangle 1:\n"
                            + "+ width = "        + rectangle1.getWidth() + "\n"
                            + "+ height = "       + rectangle1.getHeight() + "\n"
                            + "+ area = "         + decimalFormat.format(Rectangle.getArea(rectangle1)) + "\n"
                            + "+ perimeter = "    + decimalFormat.format(Rectangle.getPerimeter(rectangle1)) + "\n");

        System.out.println("Rectangle 2:\n"
                            + "+ width = "        + rectangle2.getWidth() + "\n"
                            + "+ height = "       + rectangle2.getHeight() + "\n"
                            + "+ area = "         + decimalFormat.format(Rectangle.getArea(rectangle2)) + "\n"
                            + "+ perimeter = "    + decimalFormat.format(Rectangle.getPerimeter(rectangle2)) + "\n");
    }
}

public class Q4_Rectangle {
    public static void main(String[] args) {
        Rectangle.displayValue();
    }
}