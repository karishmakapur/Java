/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 2/4/19
    Project: Assignment 11 Methods, Loops, and Decisions
    Description: Write a method called sumConsonants that will take as 
                 arguments two upper case letters. Returning the 
                 sum of the consonants
 */
package assignment.pkg11.methods.loops.and.decisions;

import java.util.Scanner;

public class Console {

    public int sumConsonants(char letter1, char letter2) {
        
        //constants
        final char LETTER_A = 'A';
        final char LETTER_E = 'E';
        final char LETTER_I = 'I';
        final char LETTER_O = 'O';
        final char LETTER_U = 'U';
        
        //variable for the sum of all the consonants
        int sumOfConsonants = 0;
        
        //if/else statement to check if both characters are uppercase. If not, return -1;
        if (Character.isUpperCase(letter1) && Character.isUpperCase(letter2)) 
        {
            //if the second letter is less than the first, 
            //then I am swapping the characters, 
            //so letter 1 is less than letter 2.
            if (letter2 < letter1) 
            {
                char temp;
                temp = letter2;
                letter2 = letter1;
                letter1 = temp;
            }
            
            //looping through all the characters and only adding the consonants
            for(int startLetter = letter1; startLetter <= letter2; startLetter++)
            {
                if(startLetter != (int)LETTER_A && startLetter != (int)LETTER_E && startLetter != (int)LETTER_I &&
                        startLetter != (int)LETTER_O && startLetter != (int)LETTER_U)
                {
                    //add the ascii value to the sum
                    sumOfConsonants += (int)startLetter;
                }
                    
            }
            //after looping through all the characters 
            //and adding all the consonants, I am returning the sum
            return sumOfConsonants;
        }
        //returning -1 if any characters are not Uppercase.
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {

        //creating scanner object for later input use.
        Scanner in = new Scanner(System.in);
        
        //creating an object of the class console, so I can access the class's methods
        Console console = new Console();

        //prompting the user for input and intializing 2 char variables, 
        //after grabbing the characters entered in the string
        System.out.println("Enter two upper case characters without a space:");
        String inputStr = in.nextLine();
        char upperCaseChar1 = inputStr.charAt(0);
        char upperCaseChar2 = inputStr.charAt(1);

        //calling the sumConsonants function and placing the return value in an int variable
        int sumOfConsonants = console.sumConsonants(upperCaseChar1, upperCaseChar2);
        
        //console output
        System.out.println(String.format("The sum of the consonants is %d",sumOfConsonants));
    }

}
