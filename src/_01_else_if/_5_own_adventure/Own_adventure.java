package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {
	public static void main(String[] args) {
		
		String answer = JOptionPane.showInputDialog(null, "Hi, im bob the snail and I need your help! Will you help me?");
		
		if(answer.equals("No")) {
			JOptionPane.showMessageDialog(null, "Whatever, I don't need your help!")
		}
		else if(answer.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Great, I need to fix my broken shell and I want you to help me.");
			JOptionPane.showMessageDialog(null, "We need to get all the ingredients to craft the super glue");
			JOptionPane.showMessageDialog(null, "The first ingredient we need is lava");
			String answer2 = JOptionPane.showInputDialog(null, "Which volcano should we go to, the big volcano or the small volcano?");
			
			if (answer2.equals("The small volcano")) {
				JOptionPane.showMessageDialog(null, "You went to the small volcano but it had to little lava. In anger you punched the volcano and it collapsed with you inside it.");
			}
			if (answer2.equals("The big volcano"))
				JOptionPane.showMessageDialog(null, "You successfully got 2 buckets filled with lava");
				JOptionPane.showMessageDialog(null, "Now the next ingredient we need is diamonds");
				String answer3 = JOptionPane.showInputDialog(null, "Which cave should we go to, the steep and dangerous cave or the cave with lots of insects?");
				
				if (answer3.equals("The cave with lots of insects")) {
					JOptionPane.showMessageDialog(null, "Halfway through the cave you realized you have a fear of spiders. While running away from a big and hairy spider, you tripped on a rock and fell into a neverending pit");
				}
				else if (answer3.equals("The steep and dangerous cave")) {
					JOptionPane.showMessageDialog(null, "After realizing that you were a snail and you would stick to the ground no matter how steep it was, you collecting the diamonds that you needed easily.");
					JOptionPane.showMessageDialog(null, "Now the last ingredient we need is a muffin");
					String answer3 = JOptionPane.showInputDialog(null, "Which bakery should we go to, the very popular one, or the not so popular one?");
				}
		} 
	}
}
