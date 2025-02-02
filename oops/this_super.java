
class Ekclass{
    int a;
    
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a = a;
    }
    public int retuneone(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Mai ek constructor hu!!");
    }
}

public class this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
        Doclass x = new Doclass(45);
        

    }
}
