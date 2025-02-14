import java.util.Scanner;

public class Function_08 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        int ans = sum(a, b);
        System.out.println(ans);
        s.close();
    }
    public static  int sum(int a , int b){
        int sum = a + b;
        return sum;
    }

    
}
