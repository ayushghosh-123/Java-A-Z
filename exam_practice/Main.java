import java.util.Scanner;

class Calculator {

    // addition
    public int add(int a, int b) {
        return a + b;
    }

    // subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n---- Results ----");
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        sc.close();
    }
}
