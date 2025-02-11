package collectionsLearn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLearn {

	public static void main(String[] args) {

		Set<String> s=new HashSet<String>();
		
		s.add("Hello");
		s.add("Hello");
		s.add("Welcome");
		s.add("To");
		s.add("Quality");
		s.add("Hello");
		s.add("apple");
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		

	}

}
