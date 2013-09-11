package Q18;

import javax.swing.JFrame;

public class MainWebsiteInScrollablePane 
{
    /**
     * COMP268 Assignment 2
     * Question #18
     * File(s):	MainWebsiteInScrollablePane.java (main)
     *		PasswordToggle.java
     * 
     * Purpose:	Create an application that uploads 
     * 		a web page to a scrollable pane
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 22, 2013
     */

    public static void main(String[] args) {

	WebsiteInScrollablePane webPane = new WebsiteInScrollablePane();
	webPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	webPane.setSize(475, 200);
	webPane.setVisible(true);
    }
}
