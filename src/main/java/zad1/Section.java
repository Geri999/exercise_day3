package zad1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class Section extends Polygon {
    private Point x;
    private Point y;

    @Override
    public double getArea() {
        return 0D;
    }

    @Override
    public double getPerimeter() {
        return x.distance(y);
    }

/*    @Override
    public void printSummary() {
        System.out.printf("Area: %d,   Perimeter: %d,    Class: %s", getArea(), getPerimeter(), getDiameter());
    }*/
}
