
public class method {
    static void telljokes(){
        System.out.println("I invented a new world!\n" + "plagiarism!");
    }
    //  int logic(int x,int y)//parameter
    static int logic(int x,int y)//parameter
    {
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;
        // method obj = new method();
        // c = obj.logic(a, b);
        // c1 = obj.logic(a1, b1);
        c = logic(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 =  logic(a1, b1);
        System.out.println("answer is:"+ c);
        System.out.println("answer is:"+ c1);
        // telljokes();  
        
    }
}
