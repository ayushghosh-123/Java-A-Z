package javastatic;

public class Human {
    int age;
    String name;
    int salary;
    static boolean married;
    static long population; // static variable don't dependent on object 

    public  Human(int age , String name, int salary , boolean married){
            this.age = age;
            this.name = name ;
            this.salary = salary;
            // this.married = married;
            Human.married = married;
            Human.population += 1;
    }
}
