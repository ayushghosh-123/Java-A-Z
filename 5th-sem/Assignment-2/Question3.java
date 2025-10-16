import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }

        double evenAvg = (evenCount == 0) ? 0 : (double) evenSum / evenCount;
        double oddAvg = (oddCount == 0) ? 0 : (double) oddSum / oddCount;

        System.out.println("\n--- Results ---");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Average of even numbers: " + evenAvg);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Average of odd numbers: " + oddAvg);

        sc.close();
    }
}
