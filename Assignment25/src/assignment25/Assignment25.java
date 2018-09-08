package assignment25;
import java.util.Scanner;
public class Assignment25 {
   public static void main(String[] args) {
        //Scanner
       Scanner input1 = new Scanner(System.in);
       Scanner input2 = new Scanner(System.in);
       
       //Input
       System.out.println("Input Subtotal: ");
       double sub = input1.nextDouble();
       
       System.out.println("Input Gratuity rate (in %): ");
       double gra = input2.nextDouble();
       
       //Calc
       double newgra = sub*(gra/100);
       double total = sub+newgra;
       
       //Results
       System.out.println("The gratuity is: " + newgra);
       System.out.println("The total is: " + total);
    }
    
}
