package zad1;

public sealed interface Shape permits Circle, Polygon {
    double getArea();
    double getPerimeter();

    default Double getDiameter(Shape shape) {
        Double radius = switch (shape) {
            case Circle c -> {
                System.out.println("Circle");
                yield c.radius();
            }
            case Section s -> {
                System.out.println("Section");
                yield s.getPerimeter() / 2;
            }
            case Triangle t -> {
                System.out.println("Triangle");
                yield t.getArea() / t.getS();
            }
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
        return radius;
    }

    default void printSummary(Shape shape) {
        System.out.printf("|  Area: %10f |  Perimeter: %10f |  The radius of the circle circumscribed on the shape: %10f%n", getArea(), getPerimeter(), getDiameter(shape));
    }
}