class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is"+ id);
        System.out.println("and my name is"+ name);
    }
}

public class oops {
    public static void main(String[] args){
        System.out.println("This is our custom class:");
        Employee a = new Employee();//Instantiating a new Employe object
        Employee john = new Employee();//Instantiating a new Employe object

        //Setting Attributes for ayush
        a.id = 12;
        a.salary = 34;
        a.name = "AyushGhosh";

        // seting attribute for john
        john.id = 13;
        john.salary = 12;
        john.name = "john khandelwal";

        //printing the attributes
        a.printdetails();
        john.printdetails();
        // System.out.println(a.id);
        // System.out.println(a.name);

    }
}
