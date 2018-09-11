/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author Rosenstand
 */
public class Test {
    public static void main(String[] args) {
        //Scanner
        Scanner input1 = new Scanner(System.in);
        
        //Input (month number)
        System.out.println("Input a number corespoding with a month (1-12 (1 for January, etc.)): ");
        int mn = input1.nextInt();
        
       //Array for Days in a Month
        int [] dim;
        dim = new int[13];
        dim[1] = 31;    //January
        dim[2] = 28;    //Febuary
        dim[3] = 31;    //March
        dim[4] = 30;    //April
        dim[5] = 31;    //May
        dim[6] = 30;    //June
        dim[7] = 31;    //July
        dim[8] = 31;    //August
        dim[9] = 30;    //September
        dim[10] = 31;   //October
        dim[11] = 30;   //November
        dim[12] = 31;   //December
        
        //Array for Months
        String [] month;
        month = new String[13];
        month[1] = "January";
        month[2] = "Febuary";
        month[3] = "March";
        month[4] = "April";
        month[5] = "May";
        month[6] = "June";
        month[7] = "July";
        month[8] = "August";
        month[9] = "September";
        month[10] = "October";
        month[11] = "November";
        month[12] = "December";
        
        //Results
       if (mn>=1 && mn<=12){
        System.out.println("Theres " + dim[mn] + " in " + month[mn]);
        } else {
        System.out.println("Invalid Input"); //for in case someone typed 0 which exist in the array but arent used (since all other numbers gives and error for the number not being part of the array)
        }
    }
}
