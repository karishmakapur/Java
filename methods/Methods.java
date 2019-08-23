/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 2/4/19
    Project: Assignment 10 Methods
    Description: Conversion calculator. Using a switch statement with a while loop
                to work converter and methods for each conversion.
 */

package assignment.pkg10.methods;

import java.util.Scanner;

public class Methods 
{
    //function to convert celsius to fahrenheit
    public double celsiusToFahrenheit(double celsius) 
    {
        //constant 
        final double NUMBER_TO_MULTIPLY_BY = 9.0/5.0;
        final double NUMBER_TO_ADD = 32;
        
        //conversion
        double fahrenheit = (celsius * NUMBER_TO_MULTIPLY_BY) + NUMBER_TO_ADD;
        return fahrenheit;
    }

    //function to convert kelvin to fahrenheit
    public double kelvinToFahrenheit(double kelvin) 
    {
        //constant 
        final double NUMBER_TO_MULTIPLY_BY = 9.0/5.0;
        final double NUMBER_TO_SUBTRACT = 459.57;
        
        //conversion
        double fahrenheit = (kelvin * NUMBER_TO_MULTIPLY_BY) - NUMBER_TO_SUBTRACT;
        return fahrenheit;
    }

    //function to convert newtons to fahrenheit
    public double newtonToFahrenheit(double newtons) 
    {
        //constants
        final double NUMBER_TO_MULTIPLY_BY = 5.4545;
        final double NUMBER_TO_ADD = 32;
        
        //conversion
        double fahrenheit = (newtons * NUMBER_TO_MULTIPLY_BY) + NUMBER_TO_ADD;
        return fahrenheit;
    }

    public void displayMenu()
    {
        //printing the menu to console
        System.out.println("This temperature conversion program converts other temperature types to Fahrenheit.");
        System.out.println("The temperature types are:");
        System.out.println("C - Celsius");
        System.out.println("K - Kelvin");
        System.out.println("N - Newton");
        System.out.println("X - eXit");
        System.out.println("\nTo use the converter you much input a value and one of the temperature types."
                + "\nFor example, 32 C converts 32 degrees from Celsius to Fahrenheit.\n");
    }
    
    public static void main(String[] args) 
    {
        
        //creating an object of Scanner class, to later ask for user input
        Scanner in = new Scanner(System.in);
        
        //creating an object of Methods class, so I can access the class methods
        Methods methods = new Methods();

        //calling function to display menu to user
        methods.displayMenu();

        //priming while loop with input from user
        System.out.println("Please enter a value and it's type to be converted");
        String userInputStr = in.nextLine();

        //parsing the string into a double and a char
        String[] parsedStr = userInputStr.split(" ");
        double numberToBeConverted = Double.parseDouble(parsedStr[0]);
        String functionString = parsedStr[1].toUpperCase();
        char typeToBeConverted = functionString.charAt(0);
        
        //creating variables for later output usage
        String outputStr = "";
        double converted = 0.0;
        boolean correctInput = true;

        //constants
        final char CELSIUS = 'C';
        final char KELVIN = 'K';
        final char NEWTONS = 'N';
        final char EXIT = 'X';
        
        //while loop to determine if user wants to continue using converter
        while (typeToBeConverted != EXIT) 
        {
            
            //switch statement to determine what kind of conversion the user wants
            switch (typeToBeConverted) 
            {
                case CELSIUS:
                    //calling celsiusToFahrenheit function to convert celsius to fahrenheit
                    converted = methods.celsiusToFahrenheit(numberToBeConverted);
                    break;
                case KELVIN :
                    //calling kelvinToFahrenheit function to convert kelvin to fahrenheit
                    converted = methods.kelvinToFahrenheit(numberToBeConverted);
                    break;
                case NEWTONS:
                    //calling newtonToFahrenheit function to convert newtons to fahrenheit
                    converted = methods.newtonToFahrenheit(numberToBeConverted);
                    break;
                default:
                    outputStr = "Invalid input";
                    correctInput = false;
                    break;

            }

            //if/else statement to determine what to output to user based on if their input was valid
            if (correctInput) 
            {
                outputStr = String.format("%.1f%s is %.1f in farenheit", numberToBeConverted, typeToBeConverted, converted);
                System.out.println(outputStr);
            } 
            else
            {
                System.out.println(outputStr);
                correctInput = true;
            }
            
            //reasking user to input values
            System.out.println("Please enter a value and it's type to be converted");
            userInputStr = in.nextLine();

            //parsing the string into a double and a char
            parsedStr = userInputStr.split(" ");
            numberToBeConverted = Integer.parseInt(parsedStr[0]);
            functionString = parsedStr[1].toUpperCase();
            typeToBeConverted = functionString.charAt(0);
            
        }
        
        //when user enters 'X', the while loop exits and the user no longer 
        //is using the converter
        System.out.println("Thanks for using the Converter");
    }

}
