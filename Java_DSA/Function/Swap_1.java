public class Swap_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Swap(a,b);
    }
    // this change happen only this blocks

    
    public static int Swap(int a , int b){
        int temp = b;
        b = a ;
        a = temp;
        System.err.println(a);
        System.err.println(b);
        return 0;
    }
}
