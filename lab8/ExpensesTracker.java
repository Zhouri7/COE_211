import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.File;

public class ExpensesTracker{
  public static void main(String[] args){
        String name, purchase;
        String choice;
  
    try {
      // Create FileWriter & Scanner objects & y/n string
        FileWriter fr = new FileWriter("expenses.txt", true); // parameter 'true' is for append mode
        Scanner s = new Scanner(System.in);
        
        

        do{
            double amount;
            System.out.println("Input your name: ");
            
            name = s.nextLine();

            System.out.println("What did you purchase?");
            purchase = s.nextLine();

            System.out.println("How much did you pay? (in USD)");
            amount = s.nextDouble();
            s.nextLine();
            fr.write(name +" purchased "+ purchase + " for " + amount + " US Dollars.\n");
        
            
            
            
            System.out.println("Would you like to log another purchase? (y/n)");
            
            
            choice = s.nextLine();

        }while(choice.equals("y"));
        fr.close(); 
        if (choice.equals("n")) {
            

            System.out.println("Would you like to read a summary of your purchases?");
            choice = s.nextLine();

            Scanner fileScan = new Scanner(new File("expenses.txt"));

            if (choice.equals("y")) {
                //System.out.print("");
                while(fileScan.hasNext()) {
                    System.out.println(fileScan.nextLine());}
            }
			System.out.println("Get off of ZoodMall!");
            

        }
        
        s.close();

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}