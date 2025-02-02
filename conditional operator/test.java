import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

       if (age > 18){
        System.out.println("adult");
       }
       else{
        System.out.println("not adult");
       }
    }
}
