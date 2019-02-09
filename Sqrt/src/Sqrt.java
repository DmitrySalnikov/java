public class Sqrt {
    public static double sqrt (double x) throws java.lang.IllegalArgumentException {
        if (x < 0) {
            throw new java.lang.IllegalArgumentException("Expected non-negative number, got " + Double.toString(x));
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        sqrt(-1);
    }
}
