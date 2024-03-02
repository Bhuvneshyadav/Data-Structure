package com.code.tcs.TCS;

import java.util.Arrays;

public class SecondSmallestLargestNO {
	public static void main(String agrs[])
	{
		//int arr[]= {1,2,4,6,7,5}; // {1,2,4,5,6,7}
		int arr[]= {1};
		int n=arr.length;
		getElements(arr,n);
	}
	public static void getElements(int arr[],int n)
	{
		if(n ==0 || n==1)
		{
			System.out.println(-1);
			System.out.println(" ");
			System.out.println(-1);
		}
		else {
		Arrays.parallelSort(arr);
		int small =arr[1];
		int large =arr[n-2];
		System.out.println("Second smallest is "+small);
		System.out.println("Second Largest is "+large);
		}
	}

}
