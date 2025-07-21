import java.util.Scanner;

// linear search algorithm

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        System.out.println("The finding number is: ");
        int FindingNum = sc.nextInt();

        sc.close();

        for (int i=0; i<=arr.length-1; i++) {
            if(arr[i] == FindingNum) {
                System.out.println("The number is found at index: " + i);
                break;
            }
        }
    }
}
