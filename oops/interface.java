
import java.util.*;

interface bicycle {
    int a = 45;

    void applybreak(int decrement);

    void speedup(int increment);
}

interface HornBicycle{
    void blormHornK3g();
    void blormHorn3g();
}
class Avoncycle implements bicycle {
    int speed = 7;

    void bloHorn() {
        System.out.println("pee pee poo poo");
    }

    public void applybreak(int decrement) {
        System.out.println("Applying break");
    }

    public void speedup(int increment) {
        System.out.println("applyng speedu[p]");
    }

    public void blormHorn3g() {
        System.out.println("Kabhi khusi kabhi gum pee pee peee");
    }

    public void blormHornk3g() {
        System.out.println("Main  hoo naa po po po");
    }

}
public class interface{
    public static void main(String[] args){
        Avoncycle ayu = new Avoncycle();
        ayu.applybreak(1);

        System.out.println(ayu.a);
        
        ayu.blormHorn3g();
        ayu.blormHornk3g();
    } 
}
