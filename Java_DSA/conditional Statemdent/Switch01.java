import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Choice your option: ");
        int button = s.nextInt();
        
        switch (button) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a%b);
                break;
            case 5:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid button");
        }

    }
}