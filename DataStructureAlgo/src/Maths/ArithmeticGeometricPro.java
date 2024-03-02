package Maths;

import java.util.Arrays;

public class ArithmeticGeometricPro {
	public static void main(String agrs[])
	{
		int series[]= {10,12,14};
		System.out.println(arithmeticPro(series));
	}
	
	public static int arithmeticPro(int series[] )
	{
		int firstNumber=series[0];
		int len=series.length;
		int d= series[1]-series[0];
		int last_nth_term=firstNumber+(len-1)*d;
		int sum=(firstNumber+last_nth_term)/2;
		
		return sum;
		
		
		
	}

}
