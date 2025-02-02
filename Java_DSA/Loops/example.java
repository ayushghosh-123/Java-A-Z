import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose your option: ");
        int n = s.nextInt();
        do{
            System.out.println("Enter a number: ");
            int num = s.nextInt();
            if (num >= 90){
                System.out.println("A+");
            }else if(num < 90 && num >= 60){
                System.out.println("A");
            }else {
                System.out.println("he is fail");
            }
        }while(n == 1);
    }
}
