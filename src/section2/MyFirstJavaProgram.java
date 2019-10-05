package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class dog {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot thanos = new Robot();
	
	thanos.hide();
	thanos.setSpeed(10000);	
	thanos.turn(180);
	thanos.move(150);
	thanos.turn(90);
	thanos.setPenWidth(50000);
	
	for (int i=0; i<6000; i++){
		thanos.setRandomPenColor();
		thanos.penDown();
		thanos.move(3);
		thanos.turn(1);
		thanos.move(3);
		thanos.turn(1);
		thanos.penUp();
		thanos.move(3);
		thanos.turn(1);
		thanos.move(3);
		thanos.turn(1);
		thanos.move(3);
		thanos.turn(1);
		thanos.move(3);
		thanos.turn(1);
	}
	
	
	
	
	
	
	
	//end
	}
}
