public class Overloading {
    public static void main(String[] args) {
        // fun(45);
        // fun("hello gfg");
        int ans = sum(4, 6);
        System.out.println(ans);
    }

    static int sum (int a , int b){
        return a +b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun (int a ){
        System.out.println(a);
    }

    static void fun(String y){
        System.out.println(y);
    }
}
