package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassificationTest {

    @Test
    @DisplayName("Tam giác cân")
    void tamGiacCan() {
        String type = TriangleClassification.classify(2,2,3);
        String expected = "tam giác cân";

        assertEquals(type,expected);
    }
    @Test
    @DisplayName("Tam giác đều")
    void tamGiacDeu() {
        String type = TriangleClassification.classify(2,2,2);
        String expected = "tam giác đều";

        assertEquals(type,expected);
    }
    @Test
    @DisplayName("Tam giác thường")
    void tamGiacThuong() {
        String type = TriangleClassification.classify(3,4,5);
        String expected = "tam giác thường";

        assertEquals(type,expected);
    }
    @Test
    @DisplayName("Không phải là tam giác")
    void khongPhaiTamGiac() {
        int[][] triangleSides = {
                { 8, 2, 3 },
                { -1, 2, 1 },
                { 0, 1, 1 },
                { 0, 0, 0 }
        };

        for (int[] sides : triangleSides) {
            String actualResult = TriangleClassification.classify(sides[0], sides[1], sides[2]);
            String expectedResult = "không phải là tam giác";
            assertEquals(expectedResult, actualResult);
        }
    }
}