package stringLearn;

public class DuplicateCharacterWIthLoop {

	public static void main(String[] args) {

		String str="charcater";
		
		char ch=str.charAt(0);
		boolean b=false;
		for(int i=1;i<str.length();i++)
		{
			
			if(ch==str.charAt(i))
			{
				b=true;
				break;
			}
			
		}
		
		
		if(b)
		{
			System.out.println(ch+ " character is getting duplicated");
		}
		else
		{
			System.out.println(ch+ " character is not getting duplicated");
		}
		

	}

}
