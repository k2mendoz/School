package Q16;

import javax.swing.JFrame;

public class MainPasswordToggle
{
    /**
     * COMP268 Assignment 2
     * Question #16
     * File(s):	MainJButton.java (main)
     *		JButtonExplained.java
     * 
     * Purpose:	Explain JButton with an example program.
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 20, 2013
     */

    public static void main(String[] args) {

	PasswordToggle passToggle = new PasswordToggle();
	passToggle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	passToggle.setSize(350, 200);
	passToggle.setVisible(true);					
    }
}
