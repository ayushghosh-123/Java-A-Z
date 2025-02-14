import java.util.Arrays;

public class VarAgs {
    public static void main(String[] args) {
        // fun(1,2,3,4,5,8,6,9,7,4,5);
        fun();
        multiple(40, 50, 60, "args", "anajan", "Ayush");
    }
    static void multiple(int a, int b, int c, String ...v){
        
    }
    public static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
}
