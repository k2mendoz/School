package Q14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JButtonExplained extends JFrame {

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

    public JButtonExplained (String title) {
	super(title);

	// Set Layout Manager
	setLayout(new BorderLayout());

	// Create Swing Components
	final JTextArea textArea = new JTextArea();
	JButton JB1 = new JButton("Press this JButton");

	// Add Swing Components to content pane
	Container c = getContentPane();

	c.add(textArea, BorderLayout.CENTER);
	c.add(JB1, BorderLayout.SOUTH);

	// Add behaviour
	JB1.addActionListener(new ActionListener() {	

	    @Override
	    public void actionPerformed(ActionEvent e) {
		textArea.append("JButton is the class that allows an action to \n" +
			"occur once the button has been 'pushed' \n");
	    }
	});
    }
}


