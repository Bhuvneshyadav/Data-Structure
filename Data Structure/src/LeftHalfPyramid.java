
public class LeftHalfPyramid {

	public static void main(String[] args) {
		// for left half pyramid
		int row_no=0;
		for(int i=5 ; i>=1;i--)
		{ 
			row_no++;
			
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=row_no;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
