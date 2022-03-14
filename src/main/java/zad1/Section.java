package zad1;

import java.text.Format;

public final class Section extends Polygon {
    private Point x;
    private Point y;

    public Section(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

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

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }
}
