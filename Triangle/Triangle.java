package Triangle;

public class Triangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int[] sides) throws IllegalAccessException {
        if (areValidArguments(sides)){
            this.sideA = sides[0];
            this.sideB = sides[1];
            this.sideC = sides[2];
        } else {
            throw new IllegalAccessException("wrong arguments to create triangle with sides " +
                    + sides[0] + " " + sides[1] + " " + sides[2]);
        }
    }
    public Triangle(int sideA, int sideB, int sideC) throws IllegalAccessException {
        if (areValidArguments(sideA,sideB,sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalAccessException("wrong arguments to create triangle with sides " +
                    +sideA + " " + sideB + " " + sideC);
        }
    }
    private boolean areValidArguments(int sideA,int sideB,int sideC){
        return sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideB > sideC && sideC + sideB > sideA && sideA + sideC > sideB;
        }
    private boolean areValidArguments(int[] sides){
        return sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[0] + sides[1] > sides[2] && sides[2] + sides[1] > sides[0] && sides[0] + sides[2] > sides[1];
    }
}
