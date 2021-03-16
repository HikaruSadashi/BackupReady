import java.io.*;
public class UseReverseWord
{
    public static void main (String[] args) throws IOException
    {
	String word;
	BufferedReader MyInput = new BufferedReader (new InputStreamReader (System.in));
	
	System.out.print("Enter a word: ");
	word = MyInput.readLine();
	
	System.out.println(word + " spelled in reverse is " + ReverseWord.backWord(word));
	
	if (word.equals(ReverseWord.backWord(word))) {
	    System.out.println("The word " + word + " is a palindrome");
	}
	else {
	    System.out.println("The word " + word + " is not a palindrome");
	}
    } // main method
} // UseReverseWord class
