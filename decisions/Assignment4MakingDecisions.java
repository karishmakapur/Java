/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/23/19 
    Project: Assignment 4
    Description: determining money owed to user based on miles entered using a if/else statement
*/
package assignment.pkg4.making.decisions;

//importing Scanner class for later input from user.
import java.util.Scanner;

public class Assignment4MakingDecisions {

    public static void main(String[] args) {
      
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner(System.in);
        
        //asking user for input and initializing variable with input.
        System.out.print("Enter the amount of miles driven: ");
        int milesInput = in.nextInt();
        
        //constant values for mathematical purposes
        final double BelowMax = .25;
        final double AboveMax = .15;
        final int max = 100;
       
        //varaible for output
        double moneyOwed = 0.00;
      
        //start of if/else block
        //if milesInput is less than or equal to 100 then use BelowMax for math.
        if(milesInput <= max)
        {
           moneyOwed = BelowMax * milesInput;
        }
        else
        {
           moneyOwed = max * BelowMax;
           moneyOwed += (milesInput - max) * AboveMax;
        }
        //end of if/else statement
        
       //console output
       String owedString = String.format("You are owed $%.2f", moneyOwed);
       System.out.println(owedString);
    }
    
}
