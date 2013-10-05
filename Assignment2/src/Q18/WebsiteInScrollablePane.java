package Q18;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WebsiteInScrollablePane extends JFrame {

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

    private JLabel 	urlLabel;
    private JTextField	urlTextField;
    private JFrame	urlNewFrame;
    private URL 	userUrl;
    private JButton	urlButton;
    private JTextArea	urlErrorMessage;

    public WebsiteInScrollablePane () {
	super("Website in an Applet");

	// Set layout manager
	//setLayout(new FlowLayout());

	// Create swing components
	urlLabel = new JLabel("Please enter a URL and press <ENTER>");
	urlTextField = new JTextField("http://" , 20);
	urlButton = new JButton("Get webpage!");
	urlNewFrame = new JFrame("Your Website");
	new JEditorPane();
	urlErrorMessage = new JTextArea("Where is this located?");

	// Add swing components to content page
	JPanel contentPane = new JPanel();
	setContentPane(contentPane);
	
	// Set positions of components within the frame	
	contentPane.setLayout(null);
	contentPane.add(urlLabel);
	urlLabel.setBounds(20, 10, 400, 30);
	contentPane.add(urlTextField);
	urlTextField.setBounds(20, 50, 400, 25);
	contentPane.add(urlButton);
	urlButton.setBounds(20, 80, 150, 40);
	contentPane.add(urlErrorMessage);
	urlErrorMessage.setBounds(200, 80, 200, 50);
	urlErrorMessage.setVisible(false);
	
	// Add behaviour
	OpenThePage openPage = new OpenThePage();
	urlTextField.addActionListener(openPage);
	urlTextField.addActionListener(openPage);
	urlButton.addActionListener(openPage);
    }

    public class OpenThePage implements ActionListener  {
	
	// Upload the web page into a JFrame
	public void actionPerformed(ActionEvent e) {

	    try {
		userUrl = new URL(urlTextField.getText());
	    } catch (MalformedURLException e2) {
		System.out.println("You have incorrectly typed in the URL.");
		urlErrorMessage.setVisible(true);
		urlErrorMessage.setText("You have typed in incorrect URL." +
				"\nPlease try again");
		e2.printStackTrace();
	    }
	    JEditorPane item5 = null;
	    try {
		item5 = new JEditorPane(userUrl);
		item5.setEditable(false);
		// Open up a new JFrame
		urlNewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		urlNewFrame.setSize(600, 700);
		urlNewFrame.setVisible(true);
		urlNewFrame.add(new JScrollPane(item5));	    
	    } catch (IOException e1) {
		System.out.println("Inside the second catch statment.");
		e1.printStackTrace();
	    }
	}
    }

    public Object getAppletContext() {
	return null;
    }
}
