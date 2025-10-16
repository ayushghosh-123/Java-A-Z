import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        if (n <= 0) {
            System.out.println("Number of cities must be greater than 0.");
            sc.close();
            return;
        }

        String[] cities = new String[n];

        // Input city names from the user
        System.out.println("Enter " + n + " city names:");
        for (int i = 0; i < n; i++) {
            cities[i] = sc.nextLine();
        }

        // Sort cities alphabetically (case-insensitive)
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);

        // Display sorted cities
        System.out.println("\nCities in alphabetical order:");
        for (String city : cities) {
            System.out.println(city);
        }

        sc.close(); 
    }
}
