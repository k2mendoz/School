package Q20;

import javax.swing.JFrame;

public class MainBMI 
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

    public static void main(String[] args) {

	BMI_Calc calcBMI = new BMI_Calc();
	calcBMI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	calcBMI.setVisible(true);
    }
}
