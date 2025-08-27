import java.util.*;

public class Introduction{
    public static void main(String[] args) {
        // store 5 roll nos
        int [] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        int[] marks = new int[5];

        // Array to store 5 Student objects
        Student[] students = new Student[5];

        // just declaring and instantiating a Student object
        Student kunal = new Student();
        // You can now assign values to its properties, for example:
        kunal.rno = 1;
        kunal.name = "Kunal";
        kunal.marks = 95.00;

        // System.out.println(kunal);
        System.out.println(kunal.rno);
        System.out.println(kunal.marks);
        System.out.println(kunal);

        // z
        System.out.println(Arrays.toString(students));
    }


    // Corrected: Moved the Student class outside main and made it static.
    // A static nested class can be instantiated without an instance of the outer class.
    static class Student{
        int rno ;
        String name ;
        double marks ;
    }
}
