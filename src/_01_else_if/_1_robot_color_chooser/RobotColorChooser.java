
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot bob = new Robot();
		while(true) {
		String answer = JOptionPane.showInputDialog("What color pen do you want?");
		
		if (answer.equals("Red")) {
			bob.setPenColor(250, 0, 0);
		} else if (answer.equals("Green")) {
			bob.setPenColor(0, 250, 0);
		} else if (answer.equals("Blue")) {
			bob.setPenColor(0, 0, 250);
		} else {
			bob.setRandomPenColor();
		}

		bob.setSpeed(10);
		bob.setPenWidth(10);
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		}
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
