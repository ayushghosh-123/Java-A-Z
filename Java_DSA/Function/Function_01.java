import java.util.Scanner;

public class Function_01 {
    public static void PrintMyName(String name) {
        System.out.println("My name is " + name);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        PrintMyName(name);
    }
}
