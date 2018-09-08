package assignment11;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //input for miles
        System.out.print("Input miles: ");
        double m = input.nextDouble();
        
        //Calc area
        double k = (1.6*m);
        
        //Results
        System.out.println(m+ " miles is " + k + " kilometers");
    }
    
}
