import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }

        System.out.println("\n---- Results ----");

        if (evenCount > 0) {
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Average of even numbers: " + (evenSum / (double) evenCount));
        } else {
            System.out.println("No even numbers entered.");
        }

        if (oddCount > 0) {
            System.out.println("Sum of odd numbers: " + oddSum);
            System.out.println("Average of odd numbers: " + (oddSum / (double) oddCount));
        } else {
            System.out.println("No odd numbers entered.");
        }

        sc.close();

    }
}
