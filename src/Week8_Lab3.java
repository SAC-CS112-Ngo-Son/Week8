
//Son Ngo

import javax.swing.JOptionPane;

public class Week8_Lab3
{

	public static void main(String[] args)
	{
		int iBirthYear, iAge, iRemain;
	
		iBirthYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter your birth year: "));

		iAge = 2015 - iBirthYear;

		if (iAge >= 21)
			JOptionPane.showMessageDialog(null, "Here's your drink");
		else
		{
			iRemain = 21 - iAge;
			JOptionPane.showMessageDialog(null, String.format("Sorry. You need to wait %d more year(s) to drink", iRemain));
		}
			
	}

}
