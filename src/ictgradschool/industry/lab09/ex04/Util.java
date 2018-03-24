package ictgradschool.industry.lab09.ex04;

public class Util {

    /**
     * Returns a random int between the given inclusive lower and upper bounds.
     */
    public static int randomValueBetwen(int lower, int upper) {
        return  (int)(Math.random() * (upper - lower + 1)) + lower;
    }

}
