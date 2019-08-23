/*
    Name: Karishma Kapur
    ID: 0558326
    Date: 1/14/19
    Project: Assignment 2
    Description: Modifying values using unary operators and shortcut operator.
 */
package assignment.pkg2.creating.variables;

import java.util.Scanner; //importing Scanner class, so I can get data from the 
                          //keyboard and input it into my variables.

public class Assignment2CreatingVariables 
{

    public static void main(String[] args) 
    {
       //asking for input from user
       System.out.println("Enter two doubles and an int"); 
      
       //declaring and initializing variables with data taken from keyboard
        //creating an instance of Scanner class
        Scanner in = new Scanner(System.in); 
        double myDbl = in.nextDouble(); 
        double anotherDbll = in.nextDouble();
        int myInt= in.nextInt();
        
        //modifying the 2 doubles and the int
        ++myDbl; //increasing myDbl by 1 usin unary operator
        anotherDbll-=2; //decreasing anotherDbll by 2 using shortcut operator
        myInt--; //decreasing myInt by 1 using unary operator
        
        //displaying new values
        System.out.println("Here are your numbers modified:");
        System.out.println(myDbl); //displaying value of myDbl
        System.out.println(anotherDbll); //displaying value of anotherDbll
        System.out.println(myInt); //displaying value of myInt
    }
    
}
