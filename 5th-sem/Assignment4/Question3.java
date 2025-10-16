import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to sort: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements must be greater than 0.");
            sc.close();
            return;
        }

        int[] numbers = new int[n];

        // Input numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display sorted numbers
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
