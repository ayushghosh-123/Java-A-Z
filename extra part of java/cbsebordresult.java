import java.util.Scanner;

public class cbsebordresult {
    public static void main(String args[]){

        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;
        int sum  = 0;
        float per;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first subject number");
        sub1 = s.nextInt();
        System.out.println("Enter the second subject number");
        sub2 = s.nextInt();
        System.out.println(" Enter the third subject number");
        sub3 = s.nextInt();
        System.out.println("Enter the fourth subject number");
        sub4 = s.nextInt();
        System.out.println("Enter the fifth subject number");
        sub5 = s.nextInt();

        sum = sub1+ sub2+ sub3+ sub4+ sub5;
        System.out.println("addition of number:"+ sum);

        per = sum/5;
        System.out.println("percentage value:"+ per); 
    }
}
