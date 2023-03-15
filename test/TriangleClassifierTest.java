import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void triangleTest01 () {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "This is an Equilateral triangle";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangleTest02 () {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "This is an Isosceles triangle";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    void triangleTest03 () {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "This is not a triangle";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void triangleTest04 () {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "This is not a triangle";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void triangleTest05 () {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "This is not a triangle";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}
