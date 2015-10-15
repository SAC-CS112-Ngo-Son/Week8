
//Son Ngo

import javax.swing.JOptionPane;

public class Week8_Lab2
{

	public static void main(String[] args)
	{
		int iBirthYear, iAge;
	
		iBirthYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter your birth year: "));

		iAge = 2015 - iBirthYear;

		if (iAge >= 21)
			JOptionPane.showMessageDialog(null, "Here's your drink");
		else
			JOptionPane.showMessageDialog(null, "Sorry. You're not of legal age");

	}

}
