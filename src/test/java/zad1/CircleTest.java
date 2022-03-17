package zad1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {
    Point x;
    Point y;
    Point z;

    @BeforeEach
    void setUp() {
        x = new Point(4, 7);
        y = new Point(-4, 12);
        z = new Point(0, 17);
    }

    @Test
    @DisplayName("Circle - Area should be equal to 452")
    void areaShouldBeEqualTo452() {
        Circle circle = new Circle(x, 12);
        Assertions.assertEquals(452.38934/*21169302*/, circle.getArea(), 0.01);
    }
    @Test
    @DisplayName("Circle - Area should be equal to 0")
    void areaShouldBeEqualToZero() {
        Circle circle = new Circle(x, 0);
        Assertions.assertEquals(0, circle.getArea());
    }

    @Test
    @DisplayName("Circle - Perimeter should be equal to 94")
    void perimeterShouldBeEqualTo94() {
        Circle circle = new Circle(x, 15);
        Assertions.assertEquals(94.24777960769379, circle.getPerimeter(), 0.01);
    }

    @Test
    @DisplayName("Circle - Perimeter should be equal to 0")
    void perimeterShouldBeEqualTo0() {
        Circle circle = new Circle(x, 0);
        Assertions.assertEquals(0, circle.getPerimeter());
    }

    @Test
    @DisplayName("Circle - Radius below zero should throw Ill. Arg. Exception")
    void radiusBelowZeroShouldThrowIAE() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(x, -5));
    }

    @Test
    @DisplayName("Circle - Radius above zero should NOT throw Ill. Arg. Exception")
    void radiusAboveBelowZeroShouldNOTThrowIAE() {
        Assertions.assertDoesNotThrow(() -> new Circle(x, +5));
    }
}