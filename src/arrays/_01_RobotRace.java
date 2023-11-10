package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < 5; i++) {
			Robot rob = new Robot();
			rob.moveTo(100 * i + 50, 500);
			robots[i] = rob;
		}
		while (robots[0].getY() > 50 && robots[1].getY() > 50 && robots[2].getY() > 50 && robots[3].getY() > 50 && robots[4].getY() > 50) {
			for (int i = 0; i < 5; i++) {
				if (robots[0].getY() < 50) {
					break;
				}
				else if (robots[1].getY() < 50) {
					break;
				}
				else if (robots[2].getY() < 50) {
					break;
				}
				else if (robots[3].getY() < 50) {
					break;
				}
				else if (robots[4].getY() < 50){
					break;
				}
				int rand = new Random().nextInt(100);
				robots[i].move(rand);
			}
		}
		JOptionPane.showMessageDialog(null, "THERE IS A WINNER!!!");
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
