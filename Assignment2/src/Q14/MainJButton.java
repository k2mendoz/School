package Q14;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainJButton 
{
    /**
     * COMP268 Assignment 2
     * Question #14
     * File(s):	MainJButton.java (main)
     *		JButtonExplained.java
     * 
     * Purpose:	Explain JButton with an example program.
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 20, 2013
     */

    public static void main(String[] args) {

	SwingUtilities.invokeLater(new Runnable() {
	    public void run() {
		// Create a setup the window
		JFrame JB = new JButtonExplained("Hello Swing World!");
		JB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Setup the content page
		JB.setSize(350, 150);
		JB.setVisible(true);
	    }
	});
    }
}
