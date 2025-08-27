package contructor;

public class Introduction {
    public static void main(String[] args) {

        Student sd1 = new Student();
        System.out.println("Roll no of student "+ sd1.rno);
        System.out.println("Marks no of student "+ sd1.marks);
        System.out.println("Name no of student "+ sd1.name);

        sd1.changename("shoe lover");
        sd1.getting();

    }

    static class Student{
        int rno ;
        String name ;
        double marks ;
        
        // we need a way to add the values of the above properties object by object
        // properties object by object

        // we neeed one word to acess evey object

        void getting(){
            System.out.println("My name is "+ this.name);
        }

        void changename(String newName){
            name = newName;
        }
        Student(){
            this.rno = 2;
            this.name = "ayush";
            this.marks = 9.5f;
        }

        Student(int rno, String name,  float marks){
            this.rno = rno;
            this.name = name;
            this.marks =  marks;
        
    }
}
