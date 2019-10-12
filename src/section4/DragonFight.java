package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int damage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attac = JOptionPane.showInputDialog("u moost attac! u want to attac with pressure or abuse?");
		
		// 9. If they typed in "yell":
		String pressure = "pressure";
		String abuse = "abuse";
		//-- Find a random number between 0 and 10 and store it in dragonDamage
			if (attac.equals (pressure)) {
			Random ran = new Random();
			int number = ran.nextInt(10);
			dragonDamage = number;
			
			//-- Subtract that number from the dragon's health variable 
			dragonHealth = dragonHealth - dragonDamage;
			}
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			if (attac.equals (abuse)) {
			Random o = new Random();
			int oo = o.nextInt(25);
			dragonDamage = oo;
			
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage;
			
			}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random boop = new Random();
		int boo = boop.nextInt(35);
			damage = boo;
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth - boo;
		
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth < 1) {
			JOptionPane.showMessageDialog(null, "you are ultra fat");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if (dragonHealth < 1) {
			JOptionPane.showMessageDialog(null, "you are ultra good at bullying dragons!");
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			 if (dragonHealth > 0) {
			JOptionPane.showMessageDialog(null, "Your health is " + playerHealth + ". The dragon's health is " + dragonHealth + ".");
			}
		}
	}
}
