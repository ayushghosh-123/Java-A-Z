import java.util.Scanner;

public class LoggingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (userId.equals("Ayush") && password.equals("2311206001148")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials!");
        }
    }
}
