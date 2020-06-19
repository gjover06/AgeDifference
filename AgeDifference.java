/**
Author: George Samu 
Date:06/14/2020
Purpose of this program is to read the ages of two people
and displays the difference.
*/

import java.util.Scanner;

public class AgeDifference
{
	public static void main(String[] args)
	{
	Scanner keyboard= new Scanner(System.in);
	System.out.print("What is his age? ");
	int hisAge=keyboard.nextInt();
	
	System.out.print("What is her age? ");
	Integer herAge= keyboard.nextInt();
	
	Integer ageDifference=Math.abs(hisAge-herAge);
	System.out.println("He is "+ hisAge + ",She is " + herAge +
						": a difference of " + ageDifference + ".");
	
	
	}// end main
}//end AutoBox