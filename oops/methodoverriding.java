
class a{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class b extends a{
    
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        a a = new a();
        a.meth2();

        b b = new b();
        b.meth2();
    }
}
