import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Initialize 2D array with marks [cite: 39, 40, 41, 42]
        int[][] marks = {
            {78, 65, 90}, // Student 1
            {45, 88, 72}, // Student 2
            {91, 67, 81}  // Student 3
        };
        int passingMarks = 50; // Threshold for passing [cite: 43]

        // Task 1: Calculate and display student averages [cite: 31, 32]
        double[] averages = calculateStudentAverage(marks);
        System.out.println("Average Marks:");
        for (int i = 0; i < averages.length; i++) {
            System.out.printf("Student %d = %.2f\n", (i + 1), averages[i]);
        }

        // Task 2: Find subject toppers [cite: 33, 34]
        int[] toppers = calculateSubjectToppers(marks);
        System.out.println("\nSubject Toppers:");
        for (int j = 0; j < toppers.length; j++) {
            System.out.println("Subject " + (j + 1) + " Student " + (toppers[j] + 1));
        }

        // Task 3: Display failing students [cite: 35, 36]
        System.out.println("\nFailing Students:");
        displayFailingStudents(marks, passingMarks);
    }

    // Method to calculate average marks for each student [cite: 31]
    public static double[] calculateStudentAverage(int[][] marks) {
        double[] averages = new double[marks.length]; // Create array to store averages
        for (int i = 0; i < marks.length; i++) { // Loop through students
            double sum = 0; // Initialize sum for current student
            for (int j = 0; j < marks[i].length; j++) { // Loop through subjects
                sum += marks[i][j]; // Add mark to sum
            }
            averages[i] = sum / marks[i].length; // Calculate average [cite: 32]
        }
        return averages; // Return the array of averages
    }

    // Method to find the index of the topper for each subject [cite: 33]
    public static int[] calculateSubjectToppers(int[][] marks) {
        int numSubjects = marks[0].length; // Assume all students have same subject count
        int[] toppers = new int[numSubjects]; // Array to store student index per subject
        for (int j = 0; j < numSubjects; j++) { // Loop through subjects
            int maxMark = -1; // Initialize max mark
            int topperIndex = -1; // Initialize topper index
            for (int i = 0; i < marks.length; i++) { // Loop through students
                if (marks[i][j] > maxMark) { // Check if current student has higher mark
                    maxMark = marks[i][j]; // Update max mark
                    topperIndex = i; // Update topper index [cite: 34]
                }
            }
            toppers[j] = topperIndex; // Store topper index for the subject
        }
        return toppers;
    }

    // Method to display students failing in at least one subject [cite: 35]
    public static void displayFailingStudents(int[][] marks, int passingMarks) {
        for (int i = 0; i < marks.length; i++) { // Loop through students
            for (int j = 0; j < marks[i].length; j++) { // Loop through subjects
                if (marks[i][j] < passingMarks) { // Check if mark is below passing [cite: 36]
                    System.out.println("Student " + (i + 1) + " failed in Subject " + (j + 1));
                }
            }
        }
    }
}