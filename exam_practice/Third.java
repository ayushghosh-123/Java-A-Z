import java.util.Scanner;



public class Third {
    public static class Fibonacci {

    public void printFibonacci(int n) {

        int a = 0, b = 1;

        System.out.println("\nFibonacci Series:");

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        n = sc.nextInt();

        Fibonacci f = new Fibonacci();
        f.printFibonacci(n);
        sc.close();
    }
}
