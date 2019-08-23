/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/30/19 
    Project: Assignment 8
    Description: use a while loop to determine if a users guess is equal to the random number generated.
*/
package assignment.pkg8.the.pkgwhile.loop;

//importing Scanner class for later input from user.
import java.util.Scanner;

//importing to generate a random number
import java.util.Random;

public class Assignment8TheWhileLoop {

    public static void main(String[] args) {
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner(System.in);
        
        //creating an intititalizing an instance of Random class to generate random numbers
        Random rnd = new Random();
        
        //constant varaibles
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 10;
        
        //generating a new random number
        int randomNumber = rnd.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
        
        //variable to keep track of amount of tries to guess number correctly
        int triesCounter = 0;
            
        //initializing variable to 10 as game starts with 10 points
        int points = 10;
          
        //priming while loop:
        //prompting user to enter a guess and initializing guess variable
        System.out.println("I am thinking of a number between 1 and 20."
            + "\nCan you guess it?");    
        int guess = in.nextInt();
           
        //checking to see if user guessed the random number
        while(guess != randomNumber)
        {
            //incrementing amount of tries for guessing wrong
            triesCounter++; 
            if((guess > MAX_VALUE) || (guess < MIN_VALUE))
            {
                System.out.println("Must be a number between 1 and 10.");
            }
            else
            {
                System.out.println("Sorry, wrong guess");
                //two points deducted for guessing wrong
                points -= 2;

            }
            System.out.println("Try again");  
            guess = in.nextInt();
            
        }
        
        //console output
        System.out.println("It took you " + triesCounter + " tries to guess: " + randomNumber
                + "\nYou have " + points + " points");
        
        }
    }
    
