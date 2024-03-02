package Maths;

import java.math.BigInteger;

public class BasicMathsForCoding {
	public static void main(String args[])
	{
		BasicMathsForCoding mathsForCoding=new BasicMathsForCoding();
		//System.out.println("First program of gfg series of interview preprations");
		System.out.println("By using Loops: "+mathsForCoding.countNumberOfDigits(999999999));
		System.out.println("By using Recusion: "+mathsForCoding.countNumberOfDigitsRec(99999));
		System.out.println("By using logs: "+mathsForCoding.countNumberOfDigitsLog(999911));
	}
	// Find the number of digit in a number
	//Interative approach
	public long countNumberOfDigits(long number)
	{
		//110 -> 3
		long temp=number;
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		
		
		return count;
	}
	
	// recursive appraoch
	public int countNumberOfDigitsRec(int number)
	{
		if(number ==0)
		{
			return 0;
		}
		
		
		return 1+countNumberOfDigitsRec(number/10);
	}
	//Logarithmic time
	public int countNumberOfDigitsLog(int number)
	{	
		return (int) Math.floor(Math.log10(number)+1);
	}

}
