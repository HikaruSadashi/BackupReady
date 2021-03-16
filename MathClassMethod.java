// The "MathClassMethod" class.
import java.io.*;
public class MathClassMethod
{
    public static void main (String[] args)
    {
	DataInputStream input = new DataInputStream(System.in);
	
	//declaring variables
	int choice, num1, num2;
	double num;
	//check if variable naming is ok^
	
	//output the menu
	System.out.println("Welcome to the calculator-4000!");
	System.out.println("");
	System.out.println("    1. Find the minimum of 2 numbers.");
	System.out.println("    2. Find the maximum of 2 numbers.");
	System.out.println("    3. Round a decimal value up to nearest integer.");
	System.out.println("    4. Calculate square root of a number.");
	System.out.println("    5. Calculate absolute number of a given value.");
	System.out.println("    0. Exit");
	System.out.println("");
	
	//prompt for a choice from the menu
	System.out.print("Select a value from the menu (or 0 to exit): ");

	while (choice != 0){
	    
	    //bullet proofing if their choice is not a menu choice
	    while (choice != 1, choice != 2, choice != 3, choice != 4, choice != 5)
	    {
		System.out.println("Invalid input, please select a value from the menu between 0 & 5!");
	    } 
	    
	    //if statements to perform the mathmatical funcitons based on menu choice
	    if(choice = 1)
	    {
		System.out.println("Find the minimum of 2 numbers.");
		System.out.println("please enter the first value: ");
		num1 = Integer.parseInt(input.readLine());
		System.out.println("please enter the second value: ");
		num2 = Integer.parseInt(input.readLine());
		System.out.println(Math.min(num1, num2));
	    }
	    if(choice = 2)
	    {
		System.out.println("Find the maximum of 2 numbers.");
		System.out.println("please enter the first value: ");
		num1 = Integer.parseInt(input.readLine());
		System.out.println("please enter the second value: ");
		num2 = Integer.parseInt(input.readLine());
		System.out.println(Math.max(num1, num2));
	    }
	    if(choice = 3)
	    {
		System.out.println("Round a decimal value up to nearest integer.");
		System.out.println("please enter the decimal value: ");
		num = Double.parseDoubl(input.readLine());
		System.out.println(Math.ceiling(num));
	    }
	    if(choice = 4)
	    {
		System.out.println("Calculate square root of a number.");
		System.out.println("please enter the number: ");
		num = Integer.parseInt(input.readLine());
		System.out.println(Math.sqrt(num));
	    }
	    if(choice = 4)
	    {
		System.out.println("Calculate absolute number of a given value.");
		System.out.println("please enter the value: ");
		num = Integer.parseInt(input.readLine());
		System.out.println(Math.sqrt(num));
	    }

	    //prompting user to enter value if they want to use calculator again
	    System.out.println("Please select another menu value or 0 to exit!");
	}
	
	
    } // main method
} // MathClassMethod class
