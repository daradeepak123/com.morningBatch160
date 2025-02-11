package collectionsLearn;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {

	public static void main(String[] args) {


		Map<Integer, String> map=new HashMap<Integer,String>();
		
		
		map.put(1, "hello");
		map.put(2, "hello");
		map.put(3, "hello");
		map.put(4, "hello");
		map.put(5, "hello");
		map.put(1, "hello");
		map.put(2, "hello");
		map.put(3, "hello");
		map.put(4, "hello");
		map.put(5, "hello");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+ "   "+m.getValue());
		}
		

	}

}
