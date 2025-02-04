public class Pattern_4 {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        
        for (int i = n; i >= 1; i--) { // Fix condition (i >= 1)
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars on the same line
            }
            System.out.println(); // Move to the next line
        }
    }
}