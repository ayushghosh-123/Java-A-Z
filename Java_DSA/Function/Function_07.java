import java.util.Scanner;

public class Function_07 {
    public static void MultipicationTable(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        MultipicationTable(num);
    }
}
