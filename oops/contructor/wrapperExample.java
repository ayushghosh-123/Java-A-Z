package contructor;

public class wrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        Integer num = 45;
        swap(a, b);

        System.out.println("a: "+ a+ " "+"b: "+ b);

        // using final key word
        final int bonus = 2;
        // bonus = 3; --> gives you error 
        
        A obj = new A("bhuvan ");
        System.out.println(obj);

        // final A ayush = new A("Ayush");
        // ayush.name = "other name";

        // ayush = new A("new object"); --> when a non primitive is final , you cannot ressign it.
    
    }

    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = a;
    }

    static class A{
        // always intialize while declaring 
        int num = 10;
        String name;

        public A(String name){
            this.name = name;
        }

    }
}
