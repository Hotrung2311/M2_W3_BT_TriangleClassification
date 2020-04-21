package triangle;

public class TriangleClassification {
    public static String classify(double sideA, double sideB, double sideC){
        String result = "không phải là tam giác";
        boolean isTriangle = sideA > 0 && sideB > 0 && sideC > 0;

        if (isTriangle) {
            if (sideA == sideB && sideA == sideC && sideB == sideC) {
                result = "tam giác đều";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                result = "tam giác cân";
            } else if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                result = "tam giác thường";
            } else {
                result = "không phải là tam giác";
            }
        }
        return result;
    }
}
