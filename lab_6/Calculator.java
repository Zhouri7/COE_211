package lab_6;
import java.util.Scanner;

public class Calculator {

    
    private static int num1;
    private static int num2;
    private static String operator;

   
    public static void Calculate() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number:");
        num1 = scanCalc.nextInt();scanCalc.nextLine();
        System.out.println("Input the operator:");
        operator = scanCalc.nextLine();
        System.out.println("Input the second number:");
        num2= scanCalc.nextInt();
        
        switch(operator){
            case "+": add(num1,num2);
                break;
            case "-": subtract(num1,num2);
                break;
            case "x": multiply(num1,num2);
                break;
            case "/": divide(num1,num2);
                break;
        
        }
    }

    public static void add(int a, int b) {
        int result = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static void subtract(int a, int b) {
        int result = num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    public static void multiply(int a, int b) {
        int result = num1*num2;
        System.out.println(num1 + " x " + num2 + " = " + result);
    }

    public static void divide(int a, int b) {
        if(a%b == 0) {
        System.out.println( a + " / " + b + " = " + (a/b) );
        } else {
        double e = a/(double)b;
        System.out.println( a + " / " + b + " = " + e );
}
    }
}