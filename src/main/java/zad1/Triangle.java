package zad1;

import lombok.Data;

@Data
public final class Triangle extends Polygon {
    private Point x;
    private Point y;
    private Point z;

    private final double a;
    private final double b;
    private final double c;
    private final double s;

    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;

        a = x.distance(y);
        b = y.distance(z);
        c = z.distance(x);
        s = (a + b + c) / 2;
    }

    @Override
    public double getArea() {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }


}
