import java.util.Scanner;

public class Question1{
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // check up to square root
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("\nPrime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}