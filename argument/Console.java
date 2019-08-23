/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 2/11/19
    Project: Assignment 13
    Description: fill array, print array, find amount of numbers that are even
 */
package assignment.pkg13.arrays.as.argument;

import java.util.Random;

public class Console {

    public int[] fillArray(int size)
    {
        //creating an array with new operator, so I can later fill it
        int[] array = new int[size];
        
        //creating an instance of Random class
        Random r = new Random();
        
        //constants
        final int START_POS = 0;
        final int MAX_VALUE = 100;
        final int MIN_VALUE = 1;
        final int RANDOM_NUMBER_RANGE = ((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
        
        //looping through array and generating random numbers from the range of 0 - 100.
        for(int i = START_POS; i < array.length; i++)
        {
            //adding the random numbers to the array
            array[i] = r.nextInt(RANDOM_NUMBER_RANGE);
        }
        //returning the array 
        return array;
    }
    public String arrayToString(int[] myArray)
    {
        //constants 
        final int START_POS = 0;
        
        //creating instance of StringBuilder so I can append the elements of the array to it.
        StringBuilder builder = new StringBuilder();
        
        //looping through the array to print out each element
        for(int i = START_POS; i < myArray.length; i++)
         {
             //printing out each element to the console
             builder.append(myArray[i]);
             builder.append("\n");
         }
        
        //making StringBuilder into String
        String returnString = builder.toString();
        
        //returning String
        return returnString;
    }
    public int countEvens(int[] array)
    {
        //constants
        final int START_POS = 0;
        final int MODULUS_BY = 2;
        final int RESULT = 0;
        
        //variable to count the amount of evens
        int amountOfEvens = 0;
        
        //looping through array and finding the even numbers
        for(int i = START_POS; i < array.length; i++)
        {
            if(array[i] % MODULUS_BY == RESULT)
            {
                amountOfEvens++;
            }
        }
        
        //returning the count variable
        return amountOfEvens;
    }
    
    public void printArray(int[] array)
    {
        System.out.println(this.arrayToString(array));
    }
    
    public static void main(String[] args) {
        //creating object of class to access methods
        Console console = new Console();
        
        //constants
        final int SIZE = 25;
        
        //creating an array and initializing it with whatever is returned from the function fillArray.
         int[] myArray = console.fillArray(SIZE);
         
         //printing the array elements to the screen
         console.printArray(myArray);
         
         //printing the number of evens in the array
         int numberOfEvens = console.countEvens(myArray);
         System.out.println(String.format("There are %d even numbers in the array.", numberOfEvens));
        
    }
    
}
