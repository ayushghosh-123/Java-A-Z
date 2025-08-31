package contructor;

public class Introduction {
    public static void main(String[] args) {

        Student sd1 = new Student();
        System.out.println("Roll no of student " + sd1.rno);
        System.out.println("Marks of student " + sd1.marks);
        System.out.println("Name of student " + sd1.name);

        sd1.changename("shoe lover");
        sd1.getting();

        // Create a Student object 'kunal' to copy from
        Student kunal = new Student(10, "Kunal", 8.9);

        // Use copy constructor
        Student random = new Student(kunal);
        System.out.println(random.name); // prints "Kunal"
    }

    static class Student {
        int rno;
        String name;
        double marks;

        void getting() {
            System.out.println("My name is " + this.name);
        }

        void changename(String newName) {
            this.name = newName;
        }

        Student() {
            this.rno = 2;
            this.name = "ayush";
            this.marks = 9.5;
        }

        Student(int rno, String name, double marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        // Copy constructor 
        // Stdent arpit = new Student(17, "Arpit", 89.7f)
        Student(Student other) {
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
    }
}


