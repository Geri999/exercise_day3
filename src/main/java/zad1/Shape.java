package zad1;

public sealed interface Shape permits Circle, Polygon {
    double getArea();
    double getPerimeter();


    default String getDiameter() {
//        return this.getClass().getSimpleName();
        return switch (this.getClass().getSimpleName()) {
            case "Shape" -> "Shape";
            case "Circle" -> "Circle";
            case "Section" -> "Section";
            case "Triangle" -> "Triangle";
            default -> "????";
        };
    }

    default void printSummary() {
        System.out.printf("|  Area: %10f |  Perimeter: %10f |  Class: %s%n", getArea(), getPerimeter(), getDiameter());
    }


}
