import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Declare a jagged array
        int[][] arr = new int[rows][];

        // Dynamically allocate memory for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols]; // Allocate memory for this row

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the array
        System.out.println("\nDynamically initialized array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
