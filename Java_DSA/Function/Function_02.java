import java.util.Scanner;

public class Function_02 {

    public static int Add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = Add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
