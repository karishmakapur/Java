/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 2/4/19
    Project: Assignment 12 Method Overloading
    Description: summing of the each individual number in an integer.
 */
package assignment.pkg12.method.overloading;

import java.util.Scanner;

public class MethodOverload {

    public int sumNumber(int operand)
    {
        //constants
        final int NUMBER_TO_DIVIDE_BY = 10;
        final int ZERO = 0;
        
        //variable for return
        int result = ZERO;
        
        //variable for calculation
        int lastNumber = ZERO;
        
        //while loop for seeing if the number is 2+ digits, 
        //if the number is, then keep getting the last number 
        //and adding it to the previous number to get a sum.
        while(operand % NUMBER_TO_DIVIDE_BY != ZERO)
        {
            //getting the last number. EX: If the number was 123,
            //this would put 3 into lastNumber
            lastNumber = operand % NUMBER_TO_DIVIDE_BY;
            
            //adding the number to calculate a sum
            result += lastNumber;
            
            //dividing by ten, so the last number is lost,
            //EX: if the number was 123, the new number would be 12, as the
            //is "lost"
            operand /= NUMBER_TO_DIVIDE_BY;
        }
        
        //returning the sum of the numbers
        return result;
    }
    public int sumNumber(int operand1, int operand2)
    {
        //calling the overloaded sumNumber method that takes 1 argument
        //to avoid repeat of code
        int sumOfFirstOperand = this.sumNumber(operand1);
        int sumOfSecondOperand = this.sumNumber(operand2);
        
        //adding the 2 sums of both numbers and returning it to the main.
        return sumOfFirstOperand + sumOfSecondOperand;
    }
    public static void main(String[] args) {
        
        //creating an object of the Scanner class for later user input
        Scanner in = new Scanner(System.in);
        
        //creating an object of the MethodOverload class, so I can access it's
        //methods
        MethodOverload methodOverload = new MethodOverload();
        
        //asking for user input and initializing 2 variables
        System.out.println("Please enter two numbers of any amount of digits:");
        int firstInput = in.nextInt();
        int secondInput = in.nextInt();
        
        //calling the sumNumber method and putting whatever is returned into sumOfInput
        int sumOfInput = methodOverload.sumNumber(firstInput, secondInput);
        
        //displaying to user the sum of the digits entered
        System.out.println(String.format("The sum of the digits is %d", sumOfInput));
    }
    
}
