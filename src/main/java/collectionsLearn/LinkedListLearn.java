package collectionsLearn;

import java.util.LinkedList;
import java.util.List;

public class LinkedListLearn {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<Integer>();
		
		ll.add(200);
		ll.add(400);
		ll.add(100);
		ll.add(200);
		
		ll.addFirst(1000);
		
		ll.clear();
		
		
		for(int i=1;i<=100;i++)
		{
			ll.addFirst(i);
		}
		
		ll.remove(0);
		
		for(int a:ll)
		{
			System.out.println(a);
		}
		
		
		

	}

}
