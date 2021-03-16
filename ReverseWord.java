// The "ReverseWord" class.
public class ReverseWord
{
    public static String backWord (String word)
    {
	StringBuffer reverse = new StringBuffer ();    
    
	for (int count = word.length() - 1; count >= 0; count--)
	{
	    reverse.append(word.charAt(count));
	}
	return reverse.toString();
    } 
} // ReverseWord class
