package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int boi = 0;
		// 2.  Ask the user a question 
		String bruh = JOptionPane.showInputDialog("what is 2 + 2");
		// 3.  Use an if statement to check if their answer is 
		//correct
		if (bruh.equals("4")) {
			
		
		// 4.  if the user's answer was correct, add one to their 
		//score 
		boi = boi + 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 
		//3 below. 
		String bruhh = JOptionPane.showInputDialog("what is 5 + 5?");
		if (bruhh.equals("10")) {
			boi = boi + 1;
		}
		String bruhhh = JOptionPane.showInputDialog("what is 5 multiplied by pi?");
		if (bruhhh.equals("1")) {
			boi = boi + 1;
		}
		// 6.  After all the questions have been asked, print the 
		//user's score 
		JOptionPane.showMessageDialog(null, "your score is " + boi + " out of 3!");
		
		
		
		
		
		
		
		//end
	}
}
