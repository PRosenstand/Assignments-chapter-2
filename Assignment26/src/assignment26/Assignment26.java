package assignment26;
import java.util.Scanner;
public class Assignment26 {
public static void main(String[] args) {
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //input
    System.out.println("Input a number from 0-1000: ");
    double n = input.nextDouble();
    
    //Calc
    double ones = n%10, tens = (n<10) ? 1: ((n-ones)/10)%10, hundreds = (n<100) ? 1: ((n-((tens*10)+ones))/100)%10;
    double total = hundreds*tens*ones;
    //results
        //Debug
        //System.out.println("Ones: " + ones + ", Tens: " + tens + ", Hundreds: "+ hundreds);
    System.out.println("Multiplying the numbers gives: " + total );
    }
}
