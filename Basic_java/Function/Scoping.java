public class Scoping {
    public static void main(String[] args) {
        int a = 80;
        // random(marks);
        random(a);
        
    }
    public static void  random(int marks){
        int num = 67;
        String name = "kumal";
        // anything intialise their not intialise the block scope
        {
            // int num = 75;
            num = 75; // reassign the original ref variable to some other value
            // int c = 45;
            int c = 45;
            name = "rahul";
            
        }
        int c = 10;
        System.out.println(c);
        System.out.println(num);
        System.out.println(name);

        for (int i = 0; i< 4; i++){
             num = 90;
            int a = 10000;
        }
        System.out.println(num);
        // System.out.println(a);

    }
}
