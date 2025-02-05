import java.util.Scanner;

public class Array_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Initializing the 2D array
        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements of the array: ");

        // Taking input for array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Asking for the element to search
        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();

        // Searching for the element
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == x) {
                    System.out.println("Element found at index: " + i + ", " + j);
                    found = true;
                    break; // Exiting loop early after finding the element
                }
            }
            if (found) break; // Exiting outer loop early
        }

        // If element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        // Closing the scanner
        sc.close();
    }
}

