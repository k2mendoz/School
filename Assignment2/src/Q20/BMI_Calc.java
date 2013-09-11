package Q20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BMI_Calc extends JFrame 
{
    /**
     * COMP268 Assignment 2
     * Question #20
     * File(s):	MainBMI.java (main)
     *		BMI_Input.java
     *		BMI_Calc.java
     * 
     * Purpose:	Explain JButton with an example program.
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 20, 2013
     */

    private JPanel 	contentPane;
    private JTextField 	textFieldWt;
    private JTextField 	textFieldHt;
    private JButton 	calcButton;
    private JTextField 	textFieldCaclBMI;
    private JLabel 	lblYourBodyMass;
    private JTextField 	textFieldBMICategory;
    private JFrame	frame;

    public BMI_Calc() {


	// Set Layout Manager
	SpringLayout sl_contentPane = new SpringLayout();
	setBounds(100, 100, 450, 375);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);		
	contentPane.setLayout(sl_contentPane);		

	// Create Swing Components
	JLabel lblEnterWeight 		= new JLabel("Enter Weight (lbs):");
	textFieldWt 			= new JTextField();
	JLabel lblEnterHt 		= new JLabel("Enter Height (in.):");
	textFieldHt 			= new JTextField();
	calcButton 			= new JButton("Calculate your BMI");
	textFieldCaclBMI 		= new JTextField();
	lblYourBodyMass 		= new JLabel("Your Body Mass Index is:");
	JTextArea txtrThisIsWhere 	= new JTextArea();
	JButton btnMoreInformation 	= new JButton("help");
	JLabel lblThisApplicationWill 	= new JLabel("This application will calculate your Body Mass Index.");
	JLabel lblYouFallUnder 		= new JLabel("You fall under the category of:");
	textFieldBMICategory 		= new JTextField();


	// Add Swing components to the content pane
	contentPane.add(lblEnterWeight);
	contentPane.add(textFieldWt);
	contentPane.add(lblEnterHt);
	contentPane.add(textFieldHt);
	contentPane.add(calcButton);
	contentPane.add(textFieldCaclBMI);
	contentPane.add(lblYourBodyMass);
	contentPane.add(txtrThisIsWhere);
	contentPane.add(btnMoreInformation);
	contentPane.add(lblThisApplicationWill);
	contentPane.add(lblYouFallUnder);
	contentPane.add(textFieldBMICategory);

	textFieldCaclBMI.setColumns(10);
	textFieldHt.setColumns(10);
	textFieldWt.setColumns(10);
	textFieldBMICategory.setColumns(10);

	txtrThisIsWhere.setText("This is where the BMI definition goes");

	String BMI_Definition =("The body mass index (BMI), or Quetelet index, " +
		"is a heuristic proxy for estimating human body fat based on " +
		"an individual's weight and height. BMI does not actually " +
		"measure the percentage of body fat. It was devised between " +
		"1830 and 1850 by the Belgian polymath Adolphe Quetelet " +
		"during the course of developing 'social physics'.[2] Body " +
		"mass index is defined as the individual's body mass divided " +
		"by the square of his or her height. The formulae universally " +
		"used in medicine produce a unit of measure of kg/m2.");
	txtrThisIsWhere.setText(BMI_Definition);	
	
	// Label, buttons, and text area positions within the window 
	JScrollPane scroll = new JScrollPane(txtrThisIsWhere, 
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	txtrThisIsWhere.setLineWrap(true);
	txtrThisIsWhere.setWrapStyleWord(true);
	contentPane.add(scroll);
	scroll.setPreferredSize(new Dimension(400, 150));
	contentPane.setVisible(true);

	sl_contentPane.putConstraint(SpringLayout.WEST, lblEnterWeight, 0, SpringLayout.WEST, contentPane);

	sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldWt, -3, SpringLayout.NORTH, lblEnterWeight);
	sl_contentPane.putConstraint(SpringLayout.WEST,  textFieldWt, 9, SpringLayout.EAST, lblEnterWeight);
	sl_contentPane.putConstraint(SpringLayout.EAST,  textFieldWt, -274, SpringLayout.EAST, contentPane);

	sl_contentPane.putConstraint(SpringLayout.NORTH, lblEnterHt, 26, SpringLayout.SOUTH, lblEnterWeight);
	sl_contentPane.putConstraint(SpringLayout.WEST,  lblEnterHt, 0, SpringLayout.WEST, lblEnterWeight);

	sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldHt, -3, SpringLayout.NORTH, lblEnterHt);
	sl_contentPane.putConstraint(SpringLayout.WEST,  textFieldHt, 17, SpringLayout.EAST, lblEnterHt);

	sl_contentPane.putConstraint(SpringLayout.NORTH, calcButton, -4, SpringLayout.NORTH, lblEnterWeight);
	sl_contentPane.putConstraint(SpringLayout.WEST,  calcButton, 43, SpringLayout.EAST, textFieldWt);

	sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldCaclBMI, 0, SpringLayout.NORTH, lblEnterHt);
	sl_contentPane.putConstraint(SpringLayout.WEST,  textFieldCaclBMI, 63, SpringLayout.EAST, textFieldHt);

	sl_contentPane.putConstraint(SpringLayout.EAST,  textFieldHt, -43, SpringLayout.WEST, lblYourBodyMass);
	sl_contentPane.putConstraint(SpringLayout.NORTH, lblYourBodyMass, 6, SpringLayout.SOUTH, calcButton);
	sl_contentPane.putConstraint(SpringLayout.WEST,  lblYourBodyMass, 0, SpringLayout.WEST, calcButton);

	sl_contentPane.putConstraint(SpringLayout.NORTH, txtrThisIsWhere, 54, SpringLayout.SOUTH, textFieldCaclBMI);
	sl_contentPane.putConstraint(SpringLayout.WEST,  txtrThisIsWhere, 5, SpringLayout.WEST, lblEnterWeight);

	sl_contentPane.putConstraint(SpringLayout.SOUTH, txtrThisIsWhere, -1, SpringLayout.NORTH, btnMoreInformation);
	sl_contentPane.putConstraint(SpringLayout.EAST,  txtrThisIsWhere, 50, SpringLayout.EAST, btnMoreInformation);
	sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMoreInformation, 0, SpringLayout.SOUTH, contentPane);
	sl_contentPane.putConstraint(SpringLayout.EAST,  btnMoreInformation, -10, SpringLayout.EAST, contentPane);			

	sl_contentPane.putConstraint(SpringLayout.NORTH, lblEnterWeight, 13, SpringLayout.SOUTH, lblThisApplicationWill);
	sl_contentPane.putConstraint(SpringLayout.NORTH, lblThisApplicationWill, 0, SpringLayout.NORTH, contentPane);
	sl_contentPane.putConstraint(SpringLayout.WEST,  lblThisApplicationWill, 10, SpringLayout.WEST, contentPane);

	sl_contentPane.putConstraint(SpringLayout.NORTH, lblYouFallUnder, 6, SpringLayout.SOUTH, textFieldCaclBMI);
	sl_contentPane.putConstraint(SpringLayout.EAST,  lblYouFallUnder, -94, SpringLayout.EAST, contentPane);

	sl_contentPane.putConstraint(SpringLayout.SOUTH, textFieldBMICategory, -11, SpringLayout.NORTH, txtrThisIsWhere);
	sl_contentPane.putConstraint(SpringLayout.EAST,  textFieldBMICategory, 0, SpringLayout.EAST, textFieldCaclBMI);


	sl_contentPane.putConstraint(SpringLayout.NORTH, scroll, 50, SpringLayout.SOUTH, textFieldCaclBMI);
	sl_contentPane.putConstraint(SpringLayout.WEST,  scroll, 10, SpringLayout.WEST, lblEnterWeight);


	// Add behaviour
	calcButton.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {

		try {
		    String sWt = textFieldWt.getText();
		    String sHt = textFieldHt.getText();
		    float fWt = Float.parseFloat(sWt);
		    float fHt = Float.parseFloat(sHt);
		    System.out.println(fWt);
		    System.out.println(fHt);

		    float fBMI = fWt/(fHt*fHt)*703;	// Constant is from the wiki page
		    System.out.println(fBMI);
		    String sBMI = Float.toString(fBMI);
		    textFieldCaclBMI.setText(sBMI);

		    if (fBMI <= 15) {
			textFieldBMICategory.setText("Very Severely Underweight");
		    } else if ((fBMI > 15) && (fBMI <= 16)) {
			textFieldBMICategory.setText("Severely Underweight");
		    } else if ((fBMI > 16) && (fBMI <= 18.5)) {
			textFieldBMICategory.setText("Underweight");
		    } else if ((fBMI > 18.5) && (fBMI <= 25)) {
			textFieldBMICategory.setText("Healthy Weight");
		    } else if ((fBMI > 25) && (fBMI <= 30)) {
			textFieldBMICategory.setText("Overweight");
		    } else if ((fBMI > 30) && (fBMI <= 35)) {
			textFieldBMICategory.setText("Obese Class I");
		    } else if ((fBMI > 35) && (fBMI <= 40)) {
			textFieldBMICategory.setText("Obese Class II");
		    } else if (fBMI > 40) {
			textFieldBMICategory.setText("Obese Class III");
		    }
		} catch (NumberFormatException e2) {
		    JOptionPane.showMessageDialog(frame, "You must enter a " +
			    "number for both weight and height");
		} finally {
		}
	    }
	});

	// ActionListener for the "More Information" button
	btnMoreInformation.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e1) {
		System.out.println("Opening Web Page");
		try {
		    String URL = "http://en.wikipedia.org/wiki/Body_mass_index";
		    java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
		}
		catch (Exception e2) {
		    JOptionPane.showMessageDialog(null, e2.getMessage());
		}
	    }	
	});	
    }	
}
