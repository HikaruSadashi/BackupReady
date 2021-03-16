//importing swing libraries.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//other
import java.text.*;

public class JavaTriviaSpace
{
    //declaring variables here so its universal
    static JLabel title, instructions, question, result, score, blank1, blank2;
    static JButton q1, q2, q3, q4, q5, q6, checkAns;
    static JTextField txtAns;
    static boolean clkd1 = false, clkd2 = false, clkd3 = false, clkd4 = false, clkd5 = false, clkd6 = false;
    static int counter = 0, numAnswered = 0;

    //GUI Appearence method
    public static void guiApp ()
    {
	JFrame frame = new JFrame ("Java Space Trivia");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	JPanel mainPanel = new JPanel (new GridLayout (8, 1));
	JPanel buttonPanel = new JPanel (new GridLayout (1, 6));
	JPanel spacePanel = new JPanel (new GridLayout (1, 3));
	buttonPanel.setBackground (Color.cyan);

	//font objects
	Font txtFont = new Font ("Arial", Font.BOLD, 14);
	Font titleFont = new Font ("Arial", Font.BOLD, 17);

	//make labels and assigning font
	title = new JLabel ("Java Space Trivia", JLabel.CENTER);
	title.setFont (titleFont);
	blank1 = new JLabel ("");
	blank2 = new JLabel ("");
	instructions = new JLabel ("Click on any button to get a trivia question!", JLabel.CENTER);
	instructions.setFont (txtFont);
	question = new JLabel ("", JLabel.CENTER);
	question.setFont (txtFont);
	result = new JLabel ("", JLabel.CENTER);
	result.setFont (txtFont);
	score = new JLabel ("Current Score: "); //+ counter, JLabel.LEFT);
	score.setFont (txtFont);
	score.setForeground (Color.blue);

	//make text fields
	txtAns = new JTextField ("");
	txtAns.setHorizontalAlignment (JLabel.CENTER);

	//make buttons
	q1 = new JButton ("Question 1");
	q1.setFont (txtFont);
	q2 = new JButton ("Question 2");
	q2.setFont (txtFont);
	q3 = new JButton ("Question 3");
	q3.setFont (txtFont);
	q4 = new JButton ("Question 4");
	q4.setFont (txtFont);
	q5 = new JButton ("Question 5");
	q5.setFont (txtFont);
	q6 = new JButton ("Question 6");
	q6.setFont (txtFont);
	checkAns = new JButton ("Check Answer");
	checkAns.setFont (txtFont);
	checkAns.setForeground (Color.red);

	//link buttons
	ButtonHandler onClick = new ButtonHandler ();
	q1.addActionListener (onClick);
	q2.addActionListener (onClick);
	q3.addActionListener (onClick);
	q4.addActionListener (onClick);
	q5.addActionListener (onClick);
	q6.addActionListener (onClick);
	checkAns.addActionListener (onClick);

	//add components to button panel in order
	buttonPanel.add (q1);
	buttonPanel.add (q2);
	buttonPanel.add (q3);
	buttonPanel.add (q4);
	buttonPanel.add (q5);
	buttonPanel.add (q6);
	
	//add components to the text field space panel
	spacePanel.add (blank1);
	spacePanel.add (txtAns);
	spacePanel.add (blank2);

	//add components to main panel in order
	mainPanel.add (title);
	mainPanel.add (instructions);
	mainPanel.add (buttonPanel);
	mainPanel.add (spacePanel);
	//mainPanel.add (txtAns);
	mainPanel.add (checkAns);
	mainPanel.add (question);
	mainPanel.add (result);
	mainPanel.add (score);

	//container for ready and frame size & visibility
	Container contentPane = frame.getContentPane ();
	contentPane.add (mainPanel);
	frame.setSize (700, 300);
	frame.setVisible (true);
    }


    //button handler method
    private static class ButtonHandler implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    String whichOne = e.getActionCommand ();

	    //to keep track of which question is clicked/being answered
	    if (whichOne.equals ("Question 1"))
	    {
		question.setText ("Which is the smallest planet within our solar system?");
		q1.setEnabled (false);
		clkd1 = true;
	    }
	    else if (whichOne.equals ("Question 2"))
	    {
		question.setText ("Which is the second smallest planet within our solar system?");
		q2.setEnabled (false);
		clkd2 = true;
	    }
	    else if (whichOne.equals ("Question 3"))
	    {
		question.setText ("The moon called Titan orbits which planet?");
		q3.setEnabled (false);
		clkd3 = true;
	    }
	    else if (whichOne.equals ("Question 4"))
	    {
		question.setText ("Which is the brightest planet in the night's sky?");
		q4.setEnabled (false);
		clkd4 = true;
	    }
	    else if (whichOne.equals ("Question 5"))
	    {
		question.setText ("Which planet is larger, Neptune or Saturn?");
		q5.setEnabled (false);
		clkd5 = true;
	    }
	    else if (whichOne.equals ("Question 6"))
	    {
		question.setText ("Which is the only planet not named after Greek gods or goddesses?");
		q6.setEnabled (false);
		clkd6 = true;
	    }

	    //if we check answer is pressed and the jfield empty
	    String field = txtAns.getText ();
	    if (whichOne.equals ("Check Answer") && field.equals (""))
	    {
		JOptionPane.showMessageDialog (null, "Field empty, please type an answer!");
	    }

	    //CHECKING IF THE INPUT IS CORRECT WHEN THE CORRESPONDING BUTTON IS PRESSED
	    //note no further bullet proofing is needed because it ignores case and answer is one word 
	    if (whichOne.equals ("Check Answer") && clkd1 == true) //first question
	    {
		if (field.equalsIgnoreCase ("Mercury"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 1;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd1 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }
	    if (whichOne.equals ("Check Answer") && clkd2 == true) //second question
	    {
		if (field.equalsIgnoreCase ("Mars"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 2;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd2 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }
	    if (whichOne.equals ("Check Answer") && clkd3 == true) //third question
	    {
		if (field.equalsIgnoreCase ("Saturn"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 3;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd3 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }
	    if (whichOne.equals ("Check Answer") && clkd4 == true) //fourth question
	    {
		if (field.equalsIgnoreCase ("Venus"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 4;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd4 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }
	    if (whichOne.equals ("Check Answer") && clkd5 == true) //fifth question
	    {
		if (field.equalsIgnoreCase ("Saturn"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 5;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd5 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }
	    if (whichOne.equals ("Check Answer") && clkd6 == true) //sixth question
	    {
		if (field.equalsIgnoreCase ("Earth"))
		{
		    result.setText ("Correct!");
		    result.setForeground (new Color(96, 166, 102));
		    counter = counter + 6;
		    score.setText ("Current Score: " + counter);
		}
		else
		{
		    result.setText ("Incorrect!");
		    result.setForeground (Color.red);
		}
		clkd6 = false;
		txtAns.setText ("");
		numAnswered = numAnswered + 1;
	    }


	    //change current to final if all 6 questions were answered
	    if (numAnswered == 6)
	    {
		score.setText ("Final Score: " + counter);
	    }
	}
    }
    //main method
    public static void main (String[] args)
    {
	javax.swing.SwingUtilities.invokeLater (new Runnable ()
	{
	    public void run ()
	    {
		guiApp ();
	    }
	}
	);
    }
}


