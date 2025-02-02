import java.util.*;
import java.lang.Math;

public class test 
{
    public static void main(String[] args) 
    {
        double r=0,s= 0,c=0,d; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num: ");
        double n = sc.nextDouble();
        double t= n;

        while(t!= 0)
        {
            d=t%10;
            r=r*10+d;
            t= t/10;
        }

        while (r!=0)
        {
            d=r%10;
            c++;
            s=s+Math.pow(d,c);
            r=r/10;
        }

        System.out.println("sum of all number: "+ s );
    }
}

