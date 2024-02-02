

public class Main {

    public static void main(String[] args) {
        int[][] sampleInputs = {
            {1, 10},
            {100, 200},
            {201, 210},
            {900, 1000}
        };

        for (int[] inputPair : sampleInputs) {
            int i = inputPair[0];
            int j = inputPair[1];
            int maxCycleLength = findMaxCycleLength(i, j);
            System.out.println(i + " " + j + " " + maxCycleLength);
        }
    }

    public static int findMaxCycleLength(int i, int j) {
        int maxCycleLength = 0;
        int start = Math.min(i, j);
        int end = Math.max(i, j);

        for (int n = start; n <= end; n++) {
            int cycleLength = calculateCycleLength(n);
            maxCycleLength = Math.max(maxCycleLength, cycleLength);
        }
        return maxCycleLength;
    }

    public static int calculateCycleLength(int n) {
        int cycleLength = 1; 
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            cycleLength++;
        }
        return cycleLength;
    }
}
