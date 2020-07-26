package wk4;

class SimpleGeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public SimpleGeometricObject() { }

    public SimpleGeometricObject(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - this.side1) * (getPerimeter() - this.side1) *
                (getPerimeter() - this.side1));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3) / 2;
    }

    @Override
    public String toString() {
        return "Triangle has side 1: " + this.side1 + "Triangle has side 2: " + this.side2 + "Triangle has side 3: "
                + this.side3;
    }
}

class Triangle extends SimpleGeometricObject {

}

public class Q5_Triangle {
    public static void main(String[] args) {

    }
}
