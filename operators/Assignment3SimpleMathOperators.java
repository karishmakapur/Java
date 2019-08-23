/*
    Name: Karishma Kapur
    ID: 0558326
    Date: 1/14/19
    Project: Assignment 3
    Description: inputting pennies, nickles, dimes, and quarters and outputting
    it in dollars and cents.
 */

package assignment.pkg3.simple.math.operators;

import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment3SimpleMathOperators {

    public static void main(String[] args) {
        //creating an instance of Scanner class for keyboard entry
        Scanner in = new Scanner(System.in);
        
        //creating an instance of NumberFormat
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        //asking for input from user
        System.out.println("Enter pennies, nickles, dimes, and quarters");
      
        //declaring and initializing varaibles
        int numberOfPennies = in.nextInt();
        int numberOfNickles = in.nextInt();
        int numberOfDimes = in.nextInt();
        int numberOfQuarters = in.nextInt();
        
        //converting nickles, dimes, and quarters into pennies
        numberOfPennies += numberOfNickles * 5;
        numberOfPennies += numberOfDimes * 10;
        numberOfPennies += numberOfQuarters * 25;
        
        //using pennies (as I converted all change amt to pennies)to find dollar amount
        double dollarAmount = (numberOfPennies / 100) + ((numberOfPennies % 100) * .01);
       
        //displaying to user their dollar amount
        System.out.println("You have " + fmt.format(dollarAmount));       
        
    }
    
}
