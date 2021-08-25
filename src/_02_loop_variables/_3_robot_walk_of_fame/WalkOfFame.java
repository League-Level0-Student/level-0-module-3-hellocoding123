
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(50);
		
		// You also need to show the robot to see the result of this line.
                                                                         
		// 2. Make the robot draw a star shape. Hint: angle=144.
		int i = 0;
		int ii = 0;
		rob.setAngle(144-90);
		rob.penDown();
		rob.setPenWidth(5);
		rob.setSpeed(40);
		while(ii < 10) {
			while(i < 5) {
				rob.move(30);
				rob.turn(72);
				rob.move(30);
				rob.turn(-144);
				i++;
			}
	    rob.penUp();
		rob.setX(rob.getX() + 80);
		rob.penDown();
		i -= 5;
		ii++;
		}
		
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
