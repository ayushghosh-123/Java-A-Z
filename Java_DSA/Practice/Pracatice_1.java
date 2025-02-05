import java.util.Scanner;

public class Pracatice_1{

    public static void average(int a, int b, int c){
        System.out.println((a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        average(a, b, c);
    }
}