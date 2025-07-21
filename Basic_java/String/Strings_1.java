import java.util.Scanner;

public class Strings_1{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // string declaraction
        // String str = "Hello, World!"; 
        // System.out.println("String: " + str);

        String str = s.nextLine();
        System.out.println("String: " + str);
        s.close();
    }
}