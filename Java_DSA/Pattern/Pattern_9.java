// 0-1 Triangle
public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {   // Start from 1 instead of 5
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
