import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    @DisplayName("[1] test isBoundingBox")
    void isBoundingBox() {
        Point p = new Point(100,100);
        Circle c = new Circle(p, 10);
        p.translate(-10,-10);
        Rectangle r = new Rectangle(p,20,20);
        assertTrue(c.isBoundingBox(r));

        p.translate(10,10);
        Rectangle r2 = new Rectangle(p,20,20);
        assertFalse(c.isBoundingBox(r2));
    }
}