package stringLearn;

public class AllCharactersDupCheck {

	public static void main(String[] args) {

		
		String str="character";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			boolean b=false;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					if(ch==str.charAt(j))
					{
						b=true;
						break;
					}
				}
				
			}
			if(b)
			{
				System.out.println(ch+" is duplicated character");
			}
			else
			{
				System.out.println(ch+" is not a duplicated character");
			}
		}
		
		
		


	}

}
