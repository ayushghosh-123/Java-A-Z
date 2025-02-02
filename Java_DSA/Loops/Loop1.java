import java.util.*;
public class Loop1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = s.nextInt();
        int sum = 0;
        
        // for loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}