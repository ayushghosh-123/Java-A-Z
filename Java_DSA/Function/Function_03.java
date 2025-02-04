import java.util.Scanner;

public class Function_03 {

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int mul = mul(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + mul);
    }
}
