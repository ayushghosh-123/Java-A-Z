import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
