import java.util.Scanner;

public class Function_06 {
    public static void EvenOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
        else{
            System.out.println(num + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        EvenOdd(num);

    }
}
