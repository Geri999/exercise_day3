package zad1;

import java.awt.geom.Point2D;

public record Point(double x, double y) {

    public double distance(Point p) {
//        return Math.sqrt(Math.pow(x() - p.x(), 2) + Math.pow(y() - p.y(), 2));
        return Point2D.distance(x(), y(), p.x(), p.y());
    }

}
