public class methodover {
    // static void motivation(){
    //     System.out.println("I invented a new world!\n"+"plagiarism!");
    // }
    static void change(int a){
        a = 98;
    }
    static void change2(int[] arr){
        arr[0] = 98;
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning"+a +"bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning"+a +"bro!"+b);
    }
    public static void main(String[] args){
        // changing the integer
        // int x = 45;
        // change(x);
        // System.out.println("the value of sx after running change is -"+ x);

        // change 1: changing the array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("the valu of x after running chage is:"+ marks[0]); 

        // method overloding
        foo();
        foo(3000);
        foo(3000, 6000);
        // Argument actual
    }
}
