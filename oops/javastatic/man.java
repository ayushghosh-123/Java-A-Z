package javastatic;
import  javastatic.Human;

public class man {
    public static void main(String[] args) {
            Human ayush = new Human(25, "ayush", 71000, false);
            Human raja = new Human(35, "raj sharma ", 71000, false);
            System.out.println(ayush.name);
            System.out.println(ayush.population);
            System.out.println(raja.population);
    }
}
