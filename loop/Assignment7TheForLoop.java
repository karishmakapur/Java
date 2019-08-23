/*
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/30/19 
    Project: Assignment 7
    Description: find unique pairs using nested for loops
*/
package assignment.pkg7.the.pkgfor.loop;

//importing Scanner class for input purposes.
import java.util.Scanner;

public class Assignment7TheForLoop {

    public static void main(String[] args) {
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner(System.in);
        
        //asking user for input and initializing variable with input.
        System.out.print("Enter an ending number ");
        int endingNumber = in.nextInt();
        
        //creating a StringBuilder object for later output purposes
        StringBuilder str = new StringBuilder();
        
        //looping through 1 to the number entered by user to present numbers 
        for (int firstNumber = 1; firstNumber <= endingNumber; firstNumber++)
        {
            //finds unique pair to number presented by outer loop
            for (int secondNumber = firstNumber; secondNumber <= endingNumber; secondNumber++)
            {
                //adding pairs to StringBuilder object
                str.append(String.format("%d,%d%n", firstNumber, secondNumber));
                
            }
        }
        //console output
        System.out.println(str);
    }
    
    
}
