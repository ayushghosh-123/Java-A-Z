// full prop array


public class array {
    public static void main(String[] args) {

        // declearation and memary allocation
        // int [] marks = new int [5];

        // 2. Declearatoin and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Intialization
        // marks[0] = 100;
        // marks[1] = 98;
        // marks[2] = 76;
        // marks[3] = 100;
        // marks[4] = 88;

        // 3.Declearion, memory allocation, and intialization together
        // int [] marks = {98, 78, 88, 62, 34};
        // float [] marks = {98.20f, 78.87f, 88.98f, 62.1f, 34.789f};
        // String [] student = {"Ayush", "Arnab", "Amaresh", "Lovish"};
        // System.out.println(student.length);
        // System.out.println(student[4]);
        // String [] student = {"Ayush", "Arnab", "Amaresh", "Lovish"};


        int [] marks = {98, 78, 88, 62, 34};
        System.out.println(marks.length);


        // displaying the array(Native way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array (for loop)
        System.out.println("printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // print using forloop int reverse order
        for(int i=0; i<marks.length; i--){
            System.out.println(marks[i]);
        }

        // displaying the array(for-each loop)
        for(int element: marks){
            System.out.println(element);
        }
    }
}
