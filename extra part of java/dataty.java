import java.util.Scanner;

public class dataty {
    public static void main(String[] args) {
        // int harry;
        // int code6withha4rry;
        int number1;
        int number2;
        int number3;
        int sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num1:");
        number1 = sc.nextInt();
        
        System.out.println("enter the num2:");
        number2 = sc.nextInt();

        System.out.println("enter the num3:");
        number3 = sc.nextInt();

        sum = number1 + number2 + number3;

        System.out.println("sum of the three :"+ sum);

        //  when we are use system.out.print print something in the line.
    }
}
