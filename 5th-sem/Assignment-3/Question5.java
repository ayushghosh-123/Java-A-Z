import java.util.Scanner;

class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Method to calculate net salary after tax
    public double netSalary(double salary, double tax) {
        if (tax < 0 || tax > salary) {
            System.out.println("Invalid tax amount!");
            return salary;
        }
        return salary - tax;
    }

    // Method to return employee grade
    public String grade(String grade) {
        return grade;
    }

    // Optional: Display employee info
    public void displayInfo(double salary, double tax, String grade) {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Tax: Rs. " + tax);
        System.out.println("Net Salary: Rs. " + netSalary(salary, tax));
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        Employee emp = new Employee(name);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter tax amount: ");
        double tax = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter employee grade: ");
        String grade = sc.nextLine();

        double netSal = emp.netSalary(salary, tax);
        String empGrade = emp.grade(grade);

        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Grade: " + empGrade);
        System.out.println("Net Salary: Rs. " + netSal);

        sc.close(); 
    }
}
