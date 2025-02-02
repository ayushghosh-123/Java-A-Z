import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // int num = s.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }

        // System.out.println("Enter two numbers: ");
        // int a = s.nextInt();
        // int b = s.nextInt();
        // if (a > b) {
        //     System.out.println(a + " is greater than " + b);
        // } else if (a < b) {
        //     System.out.println(b + " is greater than " + a);
        // } else {
        //     System.out.println(a + " is equal to " + b);
        // }

        System.out.println("tap the button to start the game: ");
        int button = s.nextInt();
        if (button == 1) {
            System.out.println("hello.....");
        } else if(button == 2) {
            System.out.println("namaste....");
        }
        else if (button == 3) {
            System.out.println("bonjour...");
        }
        else {
            System.out.println("Invalid button");
        }
    }
}
