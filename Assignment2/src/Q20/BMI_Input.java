package Q20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BMI_Input1 extends JFrame {

	private JPanel 		contentPane;
	private JTextField 	textFieldWt;
	private JTextField 	textFieldAge;
	private JButton 	calcButton;
	private JTextField 	textFieldCaclBMI;
	private JLabel 		lblYourBodyMass;
	private JTextField 	textFieldBMICategory;

	public BMI_Input() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblEnterWeight = new JLabel("Enter Weight:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEnterWeight, 23, SpringLayout.WEST, contentPane);
		contentPane.add(lblEnterWeight);
		
		textFieldWt = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldWt, -3, SpringLayout.NORTH, lblEnterWeight);
		sl_contentPane.putConstraint(SpringLayout.WEST, textFieldWt, 19, SpringLayout.EAST, lblEnterWeight);
		sl_contentPane.putConstraint(SpringLayout.EAST, textFieldWt, -274, SpringLayout.EAST, contentPane);
		contentPane.add(textFieldWt);
		textFieldWt.setColumns(10);
		
		JLabel lblEnterAge = new JLabel("Enter Age:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEnterAge, 26, SpringLayout.SOUTH, lblEnterWeight);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEnterAge, 0, SpringLayout.WEST, lblEnterWeight);
		contentPane.add(lblEnterAge);
		
		textFieldAge = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldAge, -3, SpringLayout.NORTH, lblEnterAge);
		sl_contentPane.putConstraint(SpringLayout.WEST, textFieldAge, 34, SpringLayout.EAST, lblEnterAge);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		calcButton = new JButton("Calculate your BMI");
		sl_contentPane.putConstraint(SpringLayout.NORTH, calcButton, -4, SpringLayout.NORTH, lblEnterWeight);
		sl_contentPane.putConstraint(SpringLayout.WEST, calcButton, 43, SpringLayout.EAST, textFieldWt);
		contentPane.add(calcButton);
		
		textFieldCaclBMI = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textFieldCaclBMI, 0, SpringLayout.NORTH, lblEnterAge);
		sl_contentPane.putConstraint(SpringLayout.WEST, textFieldCaclBMI, 63, SpringLayout.EAST, textFieldAge);
		contentPane.add(textFieldCaclBMI);
		textFieldCaclBMI.setColumns(10);
		
		lblYourBodyMass = new JLabel("Your Body Mass Index is:");
		sl_contentPane.putConstraint(SpringLayout.EAST, textFieldAge, -43, SpringLayout.WEST, lblYourBodyMass);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblYourBodyMass, 6, SpringLayout.SOUTH, calcButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblYourBodyMass, 0, SpringLayout.WEST, calcButton);
		contentPane.add(lblYourBodyMass);
		
		JTextArea txtrThisIsWhere = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtrThisIsWhere, 54, SpringLayout.SOUTH, textFieldCaclBMI);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtrThisIsWhere, 5, SpringLayout.WEST, lblEnterWeight);
		txtrThisIsWhere.setText("This is where the BMI definition goes");
		contentPane.add(txtrThisIsWhere);
		
		JButton btnMoreInformation = new JButton("More Information");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtrThisIsWhere, -1, SpringLayout.NORTH, btnMoreInformation);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtrThisIsWhere, 0, SpringLayout.EAST, btnMoreInformation);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnMoreInformation, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMoreInformation, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnMoreInformation);
		
		JLabel lblThisApplicationWill = new JLabel("This application will calculate your Body Mass Index.");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEnterWeight, 13, SpringLayout.SOUTH, lblThisApplicationWill);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblThisApplicationWill, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblThisApplicationWill, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblThisApplicationWill);
		
		JLabel lblYouFallUnder = new JLabel("You fall under the category of:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblYouFallUnder, 6, SpringLayout.SOUTH, textFieldCaclBMI);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblYouFallUnder, -94, SpringLayout.EAST, contentPane);
		contentPane.add(lblYouFallUnder);
		
		textFieldBMICategory = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textFieldBMICategory, -11, SpringLayout.NORTH, txtrThisIsWhere);
		sl_contentPane.putConstraint(SpringLayout.EAST, textFieldBMICategory, 0, SpringLayout.EAST, textFieldCaclBMI);
		contentPane.add(textFieldBMICategory);
		textFieldBMICategory.setColumns(10);
	}
}
