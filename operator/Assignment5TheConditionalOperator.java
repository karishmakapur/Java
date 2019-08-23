/*
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/23/19 
    Project: Assignment 5
    Description: using conditional operator to determine how much money is owed 
    based on miles inputted.
*/
package assignment.pkg5.the.conditional.operator;

//importing Scanner class for input purposes.
import java.util.Scanner;

public class Assignment5TheConditionalOperator 
{

    public static void main(String[] args) 
    {
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner(System.in);
        
        //asking user for input and initializing variable with input.
        System.out.print("Enter the amount of miles driven: ");
        int milesInput = in.nextInt();
        
        //constant values for mathematical purposes
        final double BelowMax = .25;
        final double AboveMax = .15;
        final int max = 100;
        
        //using conditional operator to see if milesInput is less than or equal to 100 
        //if it is, then use BelowMax for math, otherwise use BelowMax for first 100 miles,
        //then AboveMax for every miles after 100.
        double moneyOwed = (milesInput <= max ? (BelowMax * milesInput) : 
                ((max * BelowMax) + ((milesInput - max) * AboveMax)));
       
        //console output
        String owedString = String.format("You are owed $%.2f", moneyOwed);
        System.out.println(owedString);
    }
}
