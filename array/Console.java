/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 2/11/19
    Project: Assignment 14
    Description: create an array, find coordinates where it is divisible by 3, and replace those coordinates with -1.
 */
package assignment.pkg14.two.dimensional.array;

import java.util.Random;

public class Console {

    public int[][] create2DArray(final int ROW_SIZE, final int COL_SIZE) {
        //creating an array with new operator, so I can later fill it
        int[][] array = new int[ROW_SIZE][COL_SIZE];

        //creating an instance of Random class
        Random r = new Random();

        //constants
        final int START_POS = 0;
        final int MAX_VALUE = 100;
        final int MIN_VALUE = 1;
        final int RANDOM_NUMBER_RANGE = ((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;

        //looping through array and generating random numbers from the range of 0 - 100.
        for (int row = START_POS; row < array.length; row++) {
            for (int col = START_POS; col < array[0].length; col++) {
                //adding the random numbers to the array
                array[row][col] = r.nextInt(RANDOM_NUMBER_RANGE);
            }
        }
        //returning the array 
        return array;
    }

    public String arrayToString(int[][] myArray) {
        //constants 
        final int START_POS = 0;

        //creating instance of StringBuilder so I can append the elements of the array to it.
        StringBuilder builder = new StringBuilder();

        //looping through the array to print out each element
        for (int row = START_POS; row < myArray.length; row++) {
            for (int col = START_POS; col < myArray[0].length; col++) {
                //printing out each element to the console
                builder.append(myArray[row][col]);
                builder.append("\t");
            }
            builder.append("\n");
        }

        //making StringBuilder into String
        String returnString = builder.toString();

        //returning String
        return returnString;
    }

    public void print2DArray(int[][] array) {
        System.out.println(this.arrayToString(array));
    }

    public int createCoords(int[][] array, int DIVISIBLE_BY, int[][] coordinates) {
        //constants 
        final int START_POS = 0;

        //counter variables
        int numberOfInstances = 0;

        //looping through the array to print out each element
        for (int row = START_POS; row < array.length; row++) {
            for (int col = START_POS; col < array[0].length; col++) {
                if (array[row][col] % DIVISIBLE_BY == 0) {
                    coordinates[row][col] = array[row][col];
                    numberOfInstances++;
                }
            }
        }
        return numberOfInstances;
    }

    public void fillLocations(int[][] array, int DIVISIBLE_BY) {
        //constants 
        final int START_POS = 0;
        final int VALUE_TO_FILL_WITH = -1;
        for (int row = START_POS; row < array.length; row++) {
            for (int col = START_POS; col < array[0].length; col++) {
                if (array[row][col] % DIVISIBLE_BY == 0) {
                    array[row][col] = VALUE_TO_FILL_WITH;
                }
            }
        }
    }

    public static void main(String[] args) {
        //creating an object of the class, so I can access the methods
        Console console = new Console();

        //constants
        final int ROW_SIZE = 10;
        final int COL_SIZE = 10;
        final int DIVISIBLE_BY = 3;

        System.out.println("====================================================");
        System.out.println("================== Original Array ==================");
        System.out.println("====================================================");
        
        //initializing myArray with the function create2DArray which will generate random numbers
        //and return an array
        int[][] myArray = console.create2DArray(ROW_SIZE, COL_SIZE);
        
        //printing the array to console
        console.print2DArray(myArray);

        System.out.println("====================================================");
        System.out.println("=========== After replacing Coordinates ============");
        System.out.println("====================================================");

        //creating an array to hold coordinates
        int[][] coordinatesHolder = console.create2DArray(ROW_SIZE, COL_SIZE);
        
        //in coordinatesHolder array, it will hold the coordinates that are divisible by 3 from myArray
        int amountOfCoordinates = console.createCoords(myArray, DIVISIBLE_BY, coordinatesHolder);

        //filling myArray coordinates that are divisible by 3, with -1.
        console.fillLocations(myArray, DIVISIBLE_BY);
        
        //printing the array to the console.
        console.print2DArray(myArray);
        
        //Telling user how many coordinates changed
        System.out.println(String.format("The amount of coordinates changed is %d", amountOfCoordinates));

    }

}
