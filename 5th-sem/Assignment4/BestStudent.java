import java.util.Scanner;

public class BestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_STUDENTS = 10;
        final int SUBJECTS = 5;

        System.out.print("Enter the number of students (up to 10): ");
        int n = sc.nextInt();

        if (n <= 0 || n > MAX_STUDENTS) {
            System.out.println("Invalid number of students!");
            sc.close();
            return;
        }

        int[][] marks = new int[n][SUBJECTS];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + " in " + SUBJECTS + " subjects:");
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Find the best student
        int bestStudentIndex = 0;
        double highestAverage = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / SUBJECTS;

            if (average > highestAverage) {
                highestAverage = average;
                bestStudentIndex = i;
            }
        }

        // Display marks of best student
        System.out.println("\nBest Student is Student " + (bestStudentIndex + 1));
        System.out.println("Marks in all subjects:");
        for (int j = 0; j < SUBJECTS; j++) {
            System.out.println("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j]);
        }
        System.out.printf("Average Marks: %.2f\n", highestAverage);

        sc.close();
    }
}
