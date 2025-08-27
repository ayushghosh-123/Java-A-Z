import java.util.Scanner;

class Factorial {
    int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class Factorialmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial f = new Factorial();
        System.out.println("Factorial: " + f.findFactorial(num));
    }
}
