import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        
        String[] name = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name: ");
            name[i] = sc.next();
        }

        sc.close();
        System.out.println("The names are: ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
