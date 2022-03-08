package lab_6;
import java.util.Scanner;

public class Employee {
    // Initializing variables
    private static String firstName;
    private static String lastName;
    private static int age;
    private static double salary;

    public static void newEmployee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the employee’s first name:");
        firstName = scan.nextLine();
        System.out.println("Please input the employee’s last name:");
        lastName = scan.nextLine();
        System.out.println("Please input the employee’s age:");
        age = scan.nextInt();
        System.out.println("Please input the employee’s salary:");
        salary = scan.nextDouble();
        printInfo();

    }

    public static void  printInfo() {
        System.out.println("Employee information: " + firstName + " " + lastName + ", " + age + ", " + salary );
    }
}