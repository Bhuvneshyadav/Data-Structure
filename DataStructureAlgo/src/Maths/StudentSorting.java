package Maths;

import java.util.Arrays;

public class StudentSorting {
	public static void main(String []args)
	{
		// no of drum beat required to make the sutudent array as it is initial.
		int board[]= {2,3,1,5,4};
		int student_sqno[]= {1,2,3,4,5};
		
		int temp[] = Arrays.copyOf(student_sqno, student_sqno.length);
		int count_beat=0;
		int temp1[] = Arrays.copyOf(student_sqno, student_sqno.length);
		int flag=0;
		while(true)
		{
			for(int i=0;i<board.length;i++)
		{
			int b=board[i];
			temp[b-1]=temp1[i];
			count_beat+=1;
			//check whether both the array is equal or not
			if(Arrays.equals(student_sqno, temp))
			{
				System.out.println(count_beat);
				flag=1;
				break;
				
			}
			//System.out.println();
		}
		temp1=Arrays.copyOf(temp, temp.length);
		if(flag==1)
		{
			break;
		}
		
		}
		}

}





