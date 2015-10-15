//Son Ngo

import javax.swing.JOptionPane;

public class Week8_Lab1
{

	public static void main(String[] args)
	{
		int iBirthYear, iAge;
		String sName;
		
		sName = JOptionPane.showInputDialog("Please enter your name: ");
		iBirthYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter your birth year: "));
		
		iAge = 2015 - iBirthYear;
		
		JOptionPane.showMessageDialog(null, String.format("Hello, %s, you're %d years old", sName, iAge));
	}

}
