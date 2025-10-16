import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate surface area
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("\nSurface area of the cylinder is: " + surfaceArea);

        sc.close();
    }
}
