import java.util.Scanner;

public class Practice_2 {
    public static void Oddsum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Oddsum(n);
    }
}
