package assignment22;
import java.util.Scanner;
public class Assignment22 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("Input Length of the Eqilateral triangle: ");
        double l = input.nextDouble();
        
        //Calc
        double a = ((Math.sqrt(3))/4)*(l*l);
        double v = a*l;
        
        //Results
        System.out.println("The area is: " + a);
        System.out.println("The volume of the triangular prism is: " + v);
    }
    
}
