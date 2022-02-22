import java.util.Random;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        
        int entries = rnd.nextInt(10)+1;
        
        
      
        
        
        String[] firstName = new String[entries];
        String[] lastName = new String[entries];
        int[] age = new int[entries];
        double [] monthlySalary = new double[entries];
        
        Employee[ ] E = new Employee[entries];
        
        
        System.out.println("You have "+ entries + " entries available");
        
        
        for (int i = 1; i <= entries; i++) {
            
        
        
        
        
        System.out.println("Please input the employee's first name:");
        firstName[i-1]=scan.nextLine();
        System.out.println("Please input the employee's last name:");
        lastName[i-1]=scan.nextLine();
        System.out.println("Please input the employee's age:");
        age[i-1]=scan.nextInt();scan.nextLine();
        System.out.println("Please input the employee's monthly salary:");
        monthlySalary[i-1] = scan.nextDouble();scan.nextLine();
        
        
        
        E[i-1] = new Employee(firstName[i-1],lastName[i-1],age[i-1],monthlySalary[i-1]);
        
        if((entries-i)>0){
            System.out.println("You still have "+ (entries-i) + " entries available");
        }
        
        }
        System.out.println("");
        for (int i = 1; i <= entries; i++) {
            System.out.println("Employee "+ i + " information" + E[i-1]);
        }
        
        
    }
    
}
