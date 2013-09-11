package Q16;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class PasswordToggle extends JFrame 
{
    /**
     * COMP268 Assignment 2
     * Question #16
     * File(s):	MainPassword.java (main)
     *		PasswordToggle.java
     * 
     * Purpose:	Explain JButton with an example program.
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 20, 2013
     */

    private JTextField usrPassword;
    private JPasswordField passwordField;
    private JButton passwdToggle;

    public PasswordToggle() {
	super("Create a password");
	setLayout(new FlowLayout());

	usrPassword = new JTextField("Please enter a password", 10);
	usrPassword.setEditable(false);
	add(usrPassword);

	passwordField = new JPasswordField("1234567890", 20);
	add(passwordField);

	passwdToggle = new JButton("Show characters/Hide characters");
	add(passwdToggle);

	toggler toggleAction = new toggler();
	usrPassword.addActionListener(toggleAction);		
	passwordField.addActionListener(toggleAction);
	passwdToggle.addActionListener(toggleAction);
    }

    private class toggler implements ActionListener,  ItemListener {
	
	// Modifies the text field to either characters or the user typed string
	public void actionPerformed(ActionEvent e) {

	    String usrString = "";

	    if (e.getSource() == usrPassword) {
		usrString = String.format("field 3: %s", e.getActionCommand());
	    } else if (e.getSource()==passwordField) {
		usrString = String.format("password field is %s", e.getActionCommand());
	    } else if (e.getSource()==passwdToggle) {
		if (passwordField.echoCharIsSet() == true) {
		    passwordField.setEchoChar((char) 0);
		} else {
		    passwordField.setEchoChar((char) '*');
		}
	    }
	}	

	@Override
	public void itemStateChanged(ItemEvent g) {
	    if (g.getStateChange() == ItemEvent.SELECTED) {		
	    }
	}
    }			
}