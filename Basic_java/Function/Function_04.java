import java.util.Scanner;

public class Function_04 {
    public static int factorial (int num) {
        if (num < 0) {
            System.out.println("it is invalid");
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num = sc.nextInt(); 

        int fact = factorial(num);
        System.out.println("The factorial of " + num + " is " + fact);

    }
}