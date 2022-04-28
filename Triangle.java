public class Triangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;


    public Triangle(int sideA, int sideB, int sideC) throws IllegalAccessException {
        if (sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideB > sideC && sideC + sideB > sideA && sideA + sideC > sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalAccessException("wrong arguments to create triangle with sides " +
                    + sideA + " " + sideB + " " + sideC);
        }
    }
}
