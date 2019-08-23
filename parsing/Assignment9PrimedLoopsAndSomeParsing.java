/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/30/19 
    Project: Assignment 9
    Description: Create a math calculator
*/
package assignment.pkg9.primed.loops.and.some.parsing;

//importing Scanner class for later input from user.
import java.util.Scanner;

public class Assignment9PrimedLoopsAndSomeParsing 
{

    public static void main(String[] args) 
    {
        
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner(System.in);
        
        //displaying calculator rules to user
        System.out.println("This calculator requires you to enter a function and a number");
        System.out.println("The functions are as follows: ");
        System.out.println("S - sine");
        System.out.println("C - cosine");
        System.out.println("T - tangent");
        System.out.println("R - square root");
        System.out.println("N - natural log");
        System.out.println("X - exit the program");
        
        //constant variables
        final char EXIT = 'X';
        final char SINE = 'S';
        final char COSINE = 'C';
        final char TANGENT = 'T';
        final char SQUARE_ROOT = 'R';
        final char NATURAL_LOG = 'N';
        
        //asking user for input and declaring and initializing variable with input
        System.out.println("\nPlease enter a function then a value");
        String functionStr = in.nextLine();
            
        //parsing string into 2 varaibles: operation and inputValue
        char operation = functionStr.charAt(0);
        String strValue = functionStr.substring(2);
        double inputValue = Double.parseDouble(strValue);
        double newValue = 0.00;
      
        //creating Strings for later output
        String state = "";
        String outputStr = "";
        
        //creating variable for default statement
        boolean validInput = true;
        
        //if user does not wish to exit program, calculator will keep running.
        while (Character.toUpperCase(operation) != EXIT)
        {
            //determining which operation to do based on user input
            switch(Character.toUpperCase(operation))
            {
                case SINE:
                    newValue = Math.sin(inputValue);
                    state = "sine";
                    break;
                case COSINE:
                    newValue = Math.cos(inputValue);
                    state = "cosine";
                    break;
                case TANGENT:
                    newValue = Math.tan(inputValue);
                    state = "tangent";
                    break;
                case SQUARE_ROOT:
                    newValue = Math.sqrt(inputValue);
                    state = "square root";
                    break;
                case NATURAL_LOG:
                    newValue = Math.log(inputValue);
                    state = "natural log";
                    break;
                default:
                    outputStr = "Invalid output";
                    validInput = false;
               
            } //end of switch
            
            if (validInput == true)
            {
                //formatting output for console display purposes
                outputStr = String.format("The %s of your number is ", state);
                outputStr += newValue;

                //display results of calculation that user specified
                System.out.println(outputStr); 
            }
            else
            {
                //display results of calculation that user specified
                System.out.println(outputStr); 
            }
            //resetting flag to true, so output works later in loop
            validInput = true;
            
            //asking user for input and declaring and initializing variable with input
            System.out.println("Please enter a function then a value");
            functionStr = in.nextLine();
            
            //parsing string into 2 varaibles: operation and inputValue
            operation = functionStr.charAt(0);
            strValue = functionStr.substring(2);
            inputValue = Double.parseDouble(strValue);
            
            
        }//end of while 
        
        //when user wishes to exit calculator, this statement is displayed to console
        System.out.println("Thanks for using the calculator");
        
    }//end of main
}//end of class
