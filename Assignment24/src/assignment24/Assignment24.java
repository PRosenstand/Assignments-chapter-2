/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment24;
import java.util.Scanner;
public class Assignment24 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("Input square meters: ");
        double sm = input.nextDouble();
        
        //Calc
        double p = sm*0.3025;
        
        //Results
        System.out.println(sm + "square meters is " + p + "pings");
    }
    
}
