package Arrays01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrays {

	public static void main(String agrs[])
	{
		//dynamic arrays is created using arraylist.
		
		List<Integer> arr_list= new ArrayList<>();
		
		arr_list.add(10);
		arr_list.add(20);
		
		System.out.println(arr_list.size());
		System.out.println(arr_list.contains(10));
		System.out.println(arr_list.lastIndexOf(20));
		
		//ArrayList<Integer>[] arr_l=new ArrayList[10];
		//		arr_l[0].add(10);
//		arr_l[1].add(90);
//		arr_l[0].add(100);
//		arr_l[1].add(30);
		ArrayList<Integer> l1= new ArrayList<Integer>();
		l1.add(10);
		l1.add(90);
		l1.add(100);
		l1.add(30);
		
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//arr_l.add(new ArrayList<Integer>(15));
		//System.out.println(arr_l[1].size());
	
	}
}
