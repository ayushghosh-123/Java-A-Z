package javastatic;
import  javastatic.Human;

public class man {
    public static void main(String[] args) {
            Human ayush = new Human(25, "ayush", 71000, false);
            Human raja = new Human(35, "raj sharma ", 71000, false);
            
            System.out.println(ayush.name);
            System.out.println(ayush.population);
            System.out.println(raja.population);

            // greeting(); // we know that which is not static , belongs to an object
    }

    static void fun(){
        // greeting(); // you cant use this becuse it require instance 
        // but the function you are using is it in does not depond on instance

        // you cannot acess non static stuff without referencing their instance in
        // a ststic context

        // here , i am referencing --> 

        man obj = new man();
        obj.greeting();
    }

    void greeting(){
        fun();
        System.out.println("hello gemini");
    }
}
