package collectionsLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLearn {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		//System.out.println(l.size());
		l.add(500);
		l.add(0);
		
		//System.out.println(l.size());
		int c=699;
		for(int i=699;i<=799;i++)
		{
			l.add(++c);			
		}
		l.clear();
		
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i*5;
		}
		
		for(int aa:a)   
		{
			l.add(aa);
		}
		
		for(int ii:l)
		{
			System.out.println(ii);
		}
		
	
		
		
		
		
		
		
		

	}

}
