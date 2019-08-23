/*  
    Student Name: Karishma Kapur
    Student ID: 0558326
    Date: 1/23/19 
    Project: Assignment 6
    Description: using a switch statement to determine special pricing for widgets 
    based on the amount inputted by user.
*/
package assignment.pkg6.using.the.pkgswitch.structure;

//importing Scanner class for later input from user.
import java.util.Scanner;

public class Assignment6UsingTheSwitchStructure {

    public static void main(String[] args) {
        
        //creating and initializing an instance of Scanner for keyboard entry.
        Scanner in = new Scanner (System.in);
        
        //constant variables for later calculation
        final double ONE_WIDGET_PRICING = 5.38;
        final double TWO_WIDGETS_PRICING = 4.89;
        final double THREE_WIDGETS_PRICING = 4.66;
        final double FOUR_WIDGETS_PRICING = 4.23;
 
        //asking for user input on amount of widgets purchased and initializing
        //a varaible with input
        System.out.println("How many widgets do you want to purchase?");
        int amountOfWidgetsPurchased = in.nextInt();
        
        //variable for later output
        double totalCost = 0.00;
        String WidgetsString = "The total cost of your ";
        
        //using a switch statement to determine the special pricing for widgets based 
        //on user input.
        switch(amountOfWidgetsPurchased)
        {
            case 1: 
                totalCost = ONE_WIDGET_PRICING * amountOfWidgetsPurchased;
                WidgetsString += "widget is $" + totalCost;
                break;
            case 2:
                 totalCost = TWO_WIDGETS_PRICING * amountOfWidgetsPurchased;
                 WidgetsString += "widgets is $" + totalCost;
                 break;
            case 3:
                totalCost = THREE_WIDGETS_PRICING * amountOfWidgetsPurchased;
                WidgetsString += "widgets is $" + totalCost;
                break;
            case 4:
                totalCost = FOUR_WIDGETS_PRICING * amountOfWidgetsPurchased;
                WidgetsString += "widgets is $" + totalCost;
                break;
            default:
                WidgetsString = "You are only allowed to buy up to four widgets";
                      
        }
        
       //displaying to console
         System.out.println(WidgetsString);
        
    }
    
}
