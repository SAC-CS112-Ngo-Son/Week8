
//Son Ngo

import javax.swing.JOptionPane;

public class Week8_Lab5
{

	public static void main(String[] args)
	{
		int iBirthYear, iAge, iReply = 0;
		String sName;

		do
		{
			sName = JOptionPane.showInputDialog("Please enter your name: ");
			iBirthYear = Integer.parseInt(JOptionPane.showInputDialog("Please enter your birth year: "));

			iAge = 2015 - iBirthYear;

			iReply = JOptionPane.showConfirmDialog(null,
					String.format("Hello, %s, you're %d years old.\nDo you want to continue?", sName, iAge), null,
					JOptionPane.YES_NO_OPTION);
		} while (iReply == JOptionPane.YES_OPTION);

	}

}
