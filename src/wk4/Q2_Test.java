package wk4;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends Circle {
    private double length;

    B(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getArea() {
        return super.getArea() * length;
    }

    public static void main(String[] args) {
        B b = new B(2, 3);
        System.out.println(b.getArea());
    }
}