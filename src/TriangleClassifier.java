public class TriangleClassifier {
    public static String checkTriangle(int sideA, int sideB, int sideC) {
        int totalSideAB = sideA + sideB;
        int subSideAB = sideA - sideB;
        int totalSideBC = sideB + sideC;
        int subSideBC = sideB - sideC;
        int totalSideAC = sideA + sideC;
        int subSideAC = sideA - sideC;
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if ((totalSideAB > sideC && Math.abs(subSideAB) < sideC)
                    || (totalSideBC > sideA && Math.abs(subSideBC) < sideA)
                    || (totalSideAC > sideB && Math.abs(subSideAC) < sideB)) {
                if (sideA == sideB && sideA == sideC) {
                    return "This is an Equilateral triangle";
                } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                    return "This is an Isosceles triangle";
                } else {
                    return "This is a triangle";
                }
            } else {
                return "This is not a triangle";
            }
        } else {
            return "This is not a triangle";
        }

    }
}
