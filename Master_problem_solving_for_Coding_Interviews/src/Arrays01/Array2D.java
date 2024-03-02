package Arrays01;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2D {
	
	public static void main(String args[])
	{
		// create 2d arraylist
		//[[1,2,3],[4,5,6]]
		
		ArrayList<ArrayList<Integer>> arraylist= new ArrayList<>();
		
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		ArrayList<Integer> l3=new ArrayList<>();
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		
		arraylist.add(l1);
		arraylist.add(l2);
		arraylist.add(l3);
		
		
		arraylist.get(0).set(0, 100);
		Iterator<ArrayList<Integer>> itr = arraylist.iterator();
		
		Iterator<Integer> it1;
		while(itr.hasNext())
		{
			ArrayList<Integer> l=new ArrayList<>();
			l=(ArrayList<Integer>) itr.next();
			  it1= l.iterator();
			
			while(it1.hasNext())
			{
			System.out.println(it1.next());
			}
		}
	}
}
