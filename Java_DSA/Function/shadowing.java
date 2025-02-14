public class shadowing {
    static int x  = 90; //static use not the variable object oriented & this will be shadowed at line 5
    public static void main(String[] args) {
        x = 10;
        int x = 40;
        System.err.println(x); //40
        fun(); //10
    }
    static void fun (){
        System.out.println(x);
    }
    
}
