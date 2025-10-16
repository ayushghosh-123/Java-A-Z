import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int sum = 0;        // Sum of numbers
        int sumOfSquares = 0; // Sum of squares

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum += num;
            sumOfSquares += num * num;
        }

        int squareOfSum = sum * sum;
        int difference = squareOfSum - sumOfSquares;

        System.out.println("\nSum of numbers: " + sum);
        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Square of sum: " + squareOfSum);
        System.out.println("Difference between square of sum and sum of squares: " + difference);

        sc.close();
    }
}
