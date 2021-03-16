// The "Die" class.
public class Die
{
    public static int roll ()
    {
	int roll_value = (int)(Math.random() *6 + 1);
	return roll_value;
    } 
} // Die class
