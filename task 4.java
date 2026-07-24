import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Jagged array for department enrollments [cite: 115]
        int[][] enrollment = {
                {40, 35, 50},      // Dept 1 [cite: 126]
                {20, 25},          // Dept 2 [cite: 126]
                {60, 55, 45, 30}   // Dept 3 [cite: 127]
        };
        int minStrength = 30; // Minimum required students [cite: 128]

        // Display totals [cite: 130]
        int[] totals = calculateDepartmentEnrollment(enrollment);
        for(int i=0; i<totals.length; i++) System.out.println("Department " + (i+1) + " = " + totals[i]);

        // Max department [cite: 133]
        int maxDept = findDepartmentWithMaxStudents(enrollment);
        System.out.println("Department with Maximum Students: Department " + (maxDept + 1));

        // Under-enrolled [cite: 134]
        displayUnderEnrolledCourses(enrollment, minStrength);
    }

    // Total students per department [cite: 119]
    public static int[] calculateDepartmentEnrollment(int[][] enrollment) {
        int[] totals = new int[enrollment.length]; // Storage [cite: 120]
        for (int i = 0; i < enrollment.length; i++) { // Dept loop
            for (int j = 0; j < enrollment[i].length; j++) totals[i] += enrollment[i][j]; // Sum courses
        }
        return totals;
    }

    // Department with most students [cite: 121]
    public static int findDepartmentWithMaxStudents(int[][] enrollment) {
        int[] totals = calculateDepartmentEnrollment(enrollment); // Reuse sum
        int maxIdx = 0; // Start at 0
        for (int i = 1; i < totals.length; i++) { // Compare totals
            if (totals[i] > totals[maxIdx]) maxIdx = i; // Find max index [cite: 122]
        }
        return maxIdx;
    }

    // Show courses below min strength [cite: 123]
    public static void displayUnderEnrolledCourses(int[][] enrollment, int minStrength) {
        System.out.println("Under-Enrolled Courses:");
        for (int i = 0; i < enrollment.length; i++) { // Dept loop
            for (int j = 0; j < enrollment[i].length; j++) { // Course loop
                if (enrollment[i][j] < minStrength) { // Check strength [cite: 124]
                    System.out.println("Department " + (i + 1) + " Course " + (j + 1));
                }
            }
        }
    }
}