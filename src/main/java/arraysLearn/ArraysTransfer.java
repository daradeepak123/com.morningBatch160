package arraysLearn;

import java.util.Random;

public class ArraysTransfer {
	
	
	public static String generateRandomString()
	{
		 int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();

		    return generatedString;
	}
	
	
	

	public static void main(String[] args) {

		
		String name[]=new String[10];

		for(int i=0;i<name.length;i++)
		{
			name[i]=generateRandomString();
		}
		
		

		String accName[]=new String[10];
		
		for(int i=0;i<name.length;i++)
		{
			accName[i]=name[i];
			System.out.println(accName[i]);
		}
		
		
		
		

	
	}

}
