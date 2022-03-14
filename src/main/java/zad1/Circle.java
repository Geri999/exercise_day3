package zad1;

public record Circle(Point p, double radius) implements Shape {

    public Circle {
        if (radius < 0) throw new IllegalArgumentException("Radius must be GT 0");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}