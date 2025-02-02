
abstract class base2 {
    public base2() {
        System.out.println("mai base2 ka constructor");
    }

    public void great() {
        System.out.println("Hello");
    }

    abstract public void SayHello();

    abstract public void SayHello2();
}

abstract class child2 extends base2 {
    @Override
    public void SayHello() {
        System.out.println("Good Morning");
    }

    @Override
    public void SayHello2() {
        System.out.println("good afternoon");
    }
}

class child3 extends base2{

    @Override
    public  void SayHello(){
        System.out.println("good morning");
    }

    @Override
    public void SayHello2(){
        System.out.println("Good afternoon");
    }
}



public class test {
    public static void main(String[] args) {
        // base2 p = new base2(); ---> not possible
        // child2 c = new child2() ; --->not possible it is
        child3 x  = new child3(); // it is possible
       

    }
}
