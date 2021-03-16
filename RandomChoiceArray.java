// The "RandomChoiceArray" class.
import java.io.*;
//library for random number
import java.util.Random;

public class RandomChoiceArray
{
    public static void main (String[] args) throws Exception
    {
	//declaring variables
	int choiceNum, random_int = 0;
	
	DataInputStream input = new DataInputStream(System.in);
	
	//prompts broken into multiple lines which take input into the array.
	System.out.println("Welcome to random chooser! We make the decisions for you!");
	System.out.print("How many one-word choices do you want the program to randomly pick from?: ");
	choiceNum = Integer.parseInt(input.readLine());
	System.out.println("");
	
	String[] choices = new String [choiceNum];

	System.out.println("Enter the " + choiceNum + " one-word choice(s):");
	System.out.println("");
	
	//tells for loop how much to loop (because index starts at 0)
	int loops = choiceNum - 1;
	
	//initialize each choice to an array element. 
	for (int i=0; i <= loops; i++)
	{
	    choices[i] = input.readLine();
	}
	
	//generate random values from 0 to (choiceNum-1) using the random class
	Random rand = new Random();
	int upperbound = choiceNum;
	
	random_int = rand.nextInt(upperbound); 
	
	//output the choice randomly picked
	System.out.println("The choice randomly picked is: " + choices[random_int]);
	
    } // main method
} // RandomChoiceArray class
