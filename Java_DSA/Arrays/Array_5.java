import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        int [] number = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            number[i] = sc.nextInt();
        }

        sc.close();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > min) {
                min = number[i];
            }
            if (number[i] < max) {
                max = number[i];
            }
        }

        System.out.println("The maximum number is: " + min);
        System.out.println("The minimum number is: " + max);
        
    }
}
