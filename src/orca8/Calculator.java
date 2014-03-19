package orca8;

/**
 * exercise-junit
 */
public class Calculator {

    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("y is 0");
        }
        return x / y;
    }

}
