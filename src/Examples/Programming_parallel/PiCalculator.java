package Examples.Programming_parallel;

public class PiCalculator {
    public static double calcPi(final int iterations) {
        double x;
        double y;
        int successCount = 0;
        for (int i = 0; i <= iterations; i++) {
            x = Math.random();
            y = Math.random();
            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                successCount++;
            }
        }
        return (double) (4 * successCount) / iterations;
    }
}
