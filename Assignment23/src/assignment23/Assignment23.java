package assignment23;
import java.util.Scanner;
public class Assignment23 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("Input meters: ");
        double m = input.nextDouble();
        
        //Calc
        double f = m*3.2786;
        
        //Results
        System.out.println(m + " meters is " + f + " feet");
    }
    
}
