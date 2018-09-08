package bassignment223;
import java.util.Scanner;
public class BAssignment223 {
    public static void main(String[] args) {
        //Scanners
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        
        //Input
        System.out.println("Input Driving Distance: ");
        double dd = input1.nextDouble();
        
        System.out.println("Input Fuel efficency (in miles pr gallon): ");
        double fe = input2.nextDouble();
        
        System.out.println("Input Price pr gallon: ");
        double ppg = input3.nextDouble();
        
        //Calc
        double totalcost = (dd/fe)*ppg;
        
        //Result
        System.out.println("Total cost of the trip: "+ totalcost);
    }
    
}
