
public class AdvancedWeek {
    // Initializing variables
private static    String day_1 = "Monday";
private static   String day_2 = "Tuesday";
private static   String day_3 = "Wednesday";
private static   String day_4 = "Thursday";
private static   String day_5 = "Friday";
private static   String day_6 = "Saturday";
private static   String day_7 = "Sunday";
static int index = 1;
    
    public static void printDays() {
        System.out.println("The advanced days of the week are: \n"+
index + ": " + day_1 + ",\n" +
(index + 1) + ": " + day_2 + ",\n" +
(index + 2) + ": " + day_3 + ",\n" +
(index + 3) + ": " + day_4 + ",\n" +
(index + 4) + ": " + day_5 + ",\n" +
(index + 5) + ": " + day_6 + ",\n" +
(index + 6) + ": " + day_7 + "."
);


        
        
    }
}