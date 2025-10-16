import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to compare: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of inputs must be greater than 0.");
            sc.close();
            return;
        }

        System.out.print("Enter number 1: ");
        double max = sc.nextDouble();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
        sc.close();
    }
}
