public class foreachloop {
    public static void main(String[] args){

        // lengh of array
        // int [] marks = {98, 92, 96, 93, 97, 91};
        // float [] marks = {98.1f, 92.95f, 96, 93.36f, 97, 91.00f};
        // System.out.println(marks.length);
        // System.out.println(marks[2]);
        //  String [] student = {"Harry", "Rohan", "Subham", "lovis"};
        //  System.out.println(student.length);
        //  System.out.println(student[2]);



         int[] marks= {98, 92, 96, 93, 97, 91};
        //  System.out.println(marks.length);

        // Dispay an array (Native way)
         System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[4]);
         System.out.println(marks[3]);


        //  Display the Array (for loop)
        System.err.println("{printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(i); 
        }

        // display array in reverse order
        for(int i=marks.length - 1; i>=0; i--){
            System.out.println(i); 
        }


        for(int element: marks){
                System.out.println(element);
        }
    }
}
