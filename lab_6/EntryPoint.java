
package lab_6;


import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        String option;
        Scanner s = new Scanner(System.in);
        
        
        
        
        
        do{
            
            System.out.println("Which service would you like to use?\n" +
        "[1]: Basic week visualizer\n" +
        "[2]: Advanced week visualizer\n" +
        "[3]: Basic calculator\n" +
        "[4]: Employee repertoire");
            int x = s.nextInt();
            
        switch (x){
            case 1: BasicWeek.printDays();
                break;
            case 2: AdvancedWeek.printDays();
                break;
            case 3: Calculator.Calculate();
                break;
            case 4: Employee.newEmployee();
                break;
            default: System.out.println("Please make sure you pick a number between 1 and 4");break;
        } 
        
            
            System.out.println("Would you like to perform another operation? (y/n)");
            s.nextLine();
            option  = s.nextLine();
            
           
        }while(option.equals("y"));
        
        
        
        
        
    }
}