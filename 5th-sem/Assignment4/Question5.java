import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        // Static array of month names
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Static array of days in each month for a non-leap year
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if leap year and adjust February
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days[1] = 29; // February has 29 days in leap year
        }

        System.out.println("\nDays of each month in " + year + ":");

        // Print month name and corresponding days
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + ": " + days[i] + " days");
        }

        sc.close();

    }
}
