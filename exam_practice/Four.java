import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take main string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Menu
        System.out.println("\nChoose an operation:");
        System.out.println("1. Reverse the string");
        System.out.println("2. Substring");
        System.out.println("3. Calculate string length");
        System.out.println("4. Fetch character at index 5");
        System.out.println("5. Search string using indexOf");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {

            case 1:
                String rev = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed String: " + rev);
                break;

            case 2:
                System.out.print("Enter start index: ");
                int start = sc.nextInt();
                System.out.print("Enter end index: ");
                int end = sc.nextInt();

                if (start >= 0 && end <= str.length() && start < end) {
                    System.out.println("Substring: " + str.substring(start, end));
                } else {
                    System.out.println("Invalid substring range!");
                }
                break;

            case 3:
                System.out.println("String Length: " + str.length());
                break;

            case 4:
                if (str.length() > 5) {
                    System.out.println("Character at index 5: " + str.charAt(5));
                } else {
                    System.out.println("String too short!");
                }
                break;

            case 5:
                System.out.print("Enter the word to search: ");
                String word = sc.nextLine();

                int pos = str.indexOf(word);
                if (pos != -1) {
                    System.out.println("Word found at index: " + pos);
                } else {
                    System.out.println("Word not found!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
