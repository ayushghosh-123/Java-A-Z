import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter the area of the square: ");
        double area = sc.nextDouble();

        // Calculate the side of the square
        double side = Math.sqrt(area);

        // Calculate the perimeter
        double perimeter = 4 * side;

        System.out.println("The perimeter of the square is: " + perimeter);

        sc.close();

    }
}
