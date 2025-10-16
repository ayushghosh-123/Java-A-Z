import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double ratePercent = sc.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = sc.nextInt();

        // Convert annual interest rate to decimal
        double rate = ratePercent / 100;

        // Convert months to years
        double timeInYears = months / 12.0;

        // Calculate simple interest
        double interest = principal * rate * timeInYears;

        // Calculate final balance
        double balance = principal + interest;

        System.out.println("\nSimple interest: Rs. " + interest);
        System.out.println("Balance at the end of " + months + " months: Rs. " + balance);

        sc.close();
    }
}
