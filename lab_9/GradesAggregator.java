import java.util.Scanner;
public class GradesAggregator {
    public static void main(String[] args) {
        int[] assignments = new int[5];
        double attendence,midterm, overallAssignment=0;
        
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < assignments.length; i++) {
            System.out.println("Input the grade of assignment " + (i+1));
            assignments[i]=s.nextInt();
        }

        System.out.println("Input the number of attended labs");
        attendence = s.nextInt();


        System.out.println("Input the midterm grade");
        midterm = s.nextInt();

        for (int i = 0; i < assignments.length; i++) {
            overallAssignment+=assignments[i];
        }
        
        overallAssignment/=5;
        overallAssignment*=0.3;

        attendence = attendence*100*0.05*1/7;

        midterm*=0.3;


        System.out.print("Assignments (30%): ");
        System.out.println(overallAssignment);

        System.out.print("Attendance (5%): ");
        System.out.println(attendence);

        System.out.print("Midterm (30%): ");
        System.out.println(midterm);





        

        
        
    }
}
