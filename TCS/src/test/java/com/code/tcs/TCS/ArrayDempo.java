package com.code.tcs.TCS;

/*What is Array?
An array is a collection of items stored at contiguous memory locations. 
The idea is to store multiple items of the same type together. 
This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., 
the memory location of the first element of the array (generally denoted by the name of the array).
*/
public class ArrayDempo {
	public static void main(String args[]){
		
		int [] value=new int[5];
		
		// indx=0;
		value[0]=10;
		for(int i=0;i<value.length;i++)
		{
			value[i]=2*(i+1);
		}
		
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
			
		}
	
	}

}
