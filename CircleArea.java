/**CircleArea.java
Purpose:The goal of this program is to understand how to use 
		JOptionPane
George Samu
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CircleArea
{
	public static void main(String[]args)
	{
	
	String input=JOptionPane.showInputDialog(" Enter the circle's "+
										"radius.");
	double radius = Double.parseDouble(input);
	double area = Math.PI * Math.pow(radius,2);
	JOptionPane.showMessageDialog(null, "A circle whose radius is "+
									radius + " has an area of "+
									String.format("%.2f ", area));
	
		System.exit(0);
	}//end main
}//end Circle Area
