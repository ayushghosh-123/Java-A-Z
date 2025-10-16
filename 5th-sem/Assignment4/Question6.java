import java.util.Scanner;


// Superclass Employee
class Employee {
    protected String empCode;
    protected String empName;
    protected String address;
    protected String phNo;
    protected double da;  // Dearness Allowance
    protected double hra; // House Rent Allowance

    // Constructor to initialize employee details
    public Employee(String empCode, String empName, String address, String phNo) {
        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.phNo = phNo;
    }

    // Method to calculate DA and HRA based on basic pay
    public void calculateAllowances(double basicPay) {
        da = 0.10 * basicPay;  // 10% of basic pay
        hra = 0.20 * basicPay; // 20% of basic pay
    }

    // Display employee details along with salary
    public void displaySalary(double basicPay) {
        double grossSalary = basicPay + da + hra;
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Phone No.: " + phNo);
        System.out.println("Basic Pay: Rs. " + basicPay);
        System.out.println("DA (10%): Rs. " + da);
        System.out.println("HRA (20%): Rs. " + hra);
        System.out.println("Gross Salary: Rs. " + grossSalary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private double basicPay;

    public Manager(String empCode, String empName, String address, String phNo, double basicPay) {
        super(empCode, empName, address, phNo);
        this.basicPay = basicPay;
        calculateAllowances(basicPay);
    }

    public void display() {
        displaySalary(basicPay);
    }
}

// Subclass Typist
class Typist extends Employee {
    private double basicPay;

    public Typist(String empCode, String empName, String address, String phNo, double basicPay) {
        super(empCode, empName, address, phNo);
        this.basicPay = basicPay;
        calculateAllowances(basicPay);
    }

    public void display() {
        displaySalary(basicPay);
    }
}

// Subclass Officer
class Officer extends Employee {
    private double basicPay;

    public Officer(String empCode, String empName, String address, String phNo, double basicPay) {
        super(empCode, empName, address, phNo);
        this.basicPay = basicPay;
        calculateAllowances(basicPay);
    }

    public void display() {
        displaySalary(basicPay);
    }
}


public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Manager details
        System.out.println("Enter Manager details:");
        System.out.print("Emp Code: ");
        String mCode = sc.nextLine();
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Address: ");
        String mAddress = sc.nextLine();
        System.out.print("Phone No.: ");
        String mPh = sc.nextLine();
        System.out.print("Basic Pay: ");
        double mBasic = sc.nextDouble();
        sc.nextLine(); // consume newline

        Manager manager = new Manager(mCode, mName, mAddress, mPh, mBasic);

        // Input Typist details
        System.out.println("\nEnter Typist details:");
        System.out.print("Emp Code: ");
        String tCode = sc.nextLine();
        System.out.print("Name: ");
        String tName = sc.nextLine();
        System.out.print("Address: ");
        String tAddress = sc.nextLine();
        System.out.print("Phone No.: ");
        String tPh = sc.nextLine();
        System.out.print("Basic Pay: ");
        double tBasic = sc.nextDouble();
        sc.nextLine(); // consume newline

        Typist typist = new Typist(tCode, tName, tAddress, tPh, tBasic);

        // Input Officer details
        System.out.println("\nEnter Officer details:");
        System.out.print("Emp Code: ");
        String oCode = sc.nextLine();
        System.out.print("Name: ");
        String oName = sc.nextLine();
        System.out.print("Address: ");
        String oAddress = sc.nextLine();
        System.out.print("Phone No.: ");
        String oPh = sc.nextLine();
        System.out.print("Basic Pay: ");
        double oBasic = sc.nextDouble();

        Officer officer = new Officer(oCode, oName, oAddress, oPh, oBasic);

        // Display details
        System.out.println("\n=== Employee Salary Details ===");
        manager.display();
        typist.display();
        officer.display();

        sc.close();
    }
}
