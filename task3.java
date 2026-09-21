public class Main {
    public static void main(String[] args) {
        // 1. Create a jagged array (3 patients with different number of readings)
        double[][] readings = {
            {72.5, 80.0, 75.0},      // Patient 0
            {110.2, 115.5},          // Patient 1 (Critical?)
            {90.0, 92.5, 88.0, 91.0} // Patient 2
        };

        double maxAvg = 0;
        int criticalPatientIdx = 0;

        // 2. Loop through each patient
        for (int i = 0; i < readings.length; i++) {
            double sum = 0;
            boolean isStable = true;

            for (double r : readings[i]) {
                sum += r;
                if (r >= 100) isStable = false; // 4. Check for Stability
            }

            double average = sum / readings[i].length;
            System.out.println("Patient " + i + " Average: " + average);

            // 3. Track the Critical Patient (highest average)
            if (average > maxAvg) {
                maxAvg = average;
                criticalPatientIdx = i;
            }

            if (isStable) {
                System.out.println("Status: Stable");
            }
        }

        System.out.println("\nCritical Patient is Patient #" + criticalPatientIdx);
    }
}