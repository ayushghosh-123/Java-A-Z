import java.util.Scanner;

// Interface Volume
interface Volume {
    double pi = Math.PI; // constant value of pi

    // Method to calculate Involume
    double inVolume();

    // Method to calculate Outvolume
    double outVolume();
}

// Class MachinePart implementing Volume
class MachinePart implements Volume {
    private double s1, s2, s3;

    // Constructor to initialize dimensions
    public MachinePart(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // Implement inVolume() method
    @Override
    public double inVolume() {
        return (1.0 / 3) * pi * s1 * s2 * s3;
    }

    // Implement outVolume() method
    @Override
    public double outVolume() {
        return (4.0 / 3) * pi * s1 * s2 * s3;
    }
}

// Main class
public class VolumeInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimension s1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter dimension s2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter dimension s3: ");
        double s3 = sc.nextDouble();

        // Create a MachinePart object
        MachinePart part = new MachinePart(s1, s2, s3);

        // Display Involume and Outvolume
        System.out.println("\nInvolume = " + part.inVolume());
        System.out.println("Outvolume = " + part.outVolume());

        sc.close();
    }
}
