// variable argumment

public class varargs {
    // static int sum(int a, int b){
    // return a+b;
    // }
    // static int sum(int a, int b, int c){
    // return a+b+c;
    // }
    static int sum(int ...arr){
        // available as int[]arr;
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("welcome verags tutorial");
        System.out.println("The sum of 4,3 and 5 is:"+sum());
        System.out.println("The sum of 4,3 and 5 is:"+sum(4,3, 5));
        System.out.println("The sum of 4,3 and 5 is:"+sum(4,3, 5, 6, 7, 9, 10));
    }
}
