	//Author: Divine Iloh
	//BINS 5312
	//Date: 04/10/2022

package ArrayMethodDemo;

import javax.swing.JOptionPane;
public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		int [] userEntry = new int[8];
		String result;
		
		for (int i = 0; i < userEntry.length; i++)
		{
			result = JOptionPane.showInputDialog("Enter integer number " + (i + 1));
			userEntry[i] = Integer.parseInt(result);
		}
		displayInt(userEntry);
		displayIntReverse(userEntry);
		displaySumInt(userEntry);
		displayLessAvg(userEntry);
		displayMoreAvg(userEntry);
	}

	public static void displayInt(int[] someArray)
	{
	String msg = "The numbers in the array are \n";
	for(int i = 0; i < someArray.length; i++)
	{
		msg = msg + someArray[i] + "\n";
	}
	JOptionPane.showMessageDialog(null, msg);
	}
	
	
	public static void displayIntReverse(int[] someArray)
	{
	String msg = "The numbers in the array in reverse order are \n";
	for(int i = 1; i < someArray.length; i++)
	{
		msg = msg + someArray[someArray.length - i] + "\n";
	}
	JOptionPane.showMessageDialog(null, msg);
	
	}
	
	
	public static void displaySumInt(int[] someArray)
	{
	int sum = 0;
	String msg = "The sum of the numbers in the array is \n";
	for(int i = 0; i < someArray.length; i++)
	{
		sum += someArray[i];
	}
	JOptionPane.showMessageDialog(null, msg + sum);
	}
	
	
	public static void displayLessAvg(int[] someArray)
	{
	int average = 0;
	int sum = 0;
	String msg = "The numbers in the array less than average \n";
	for(int i = 0; i < someArray.length; i++)
	{
		sum += someArray[i];
	}
	average = sum/someArray.length;
	
	for(int i = 0; i < someArray.length; i++)
	{
		if(someArray[i] < average)
		{
			msg = msg + someArray[i] + "\n";
		}
	}
	
	JOptionPane.showMessageDialog(null, msg);
	
	}
	
	
	public static void displayMoreAvg(int[] someArray)
	{
	int average = 0;
	int sum = 0;
	String msg = "The numbers in the array greater than average\n";
	for(int i = 0; i < someArray.length; i++)
	{
		sum += someArray[i];
	}
	average = sum/someArray.length;
	
	for(int i = 0; i < someArray.length; i++)
	{
		if(someArray[i] > average)
		{
			msg = msg + someArray[i] + "\n";
		}
	}
	
	JOptionPane.showMessageDialog(null, msg);
	
	}
	
	
}
