import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int num = d.nextInt();
        
        for(int i = 1; i <= num-1; i++) {  // Corrected loop condition
            for(int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        d.close();  // Closing the Scanner
    }
}
