package monsters.view;

import javax.swing.JOptionPane;

/**
 * Provides popups for input and output.
 * @author thod0127
 * @version 1.0 9/30/15
 */
public class MonsterPopups
{
	/**
	 * Provides a popup box for the user to submit an answer.
	 * Returned as a String.
	 * @param input
	 * @return
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	/**
	 * Display a popup box showing the inputed String.
	 * @param input
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
