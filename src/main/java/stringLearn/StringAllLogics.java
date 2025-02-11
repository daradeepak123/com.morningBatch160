package stringLearn;

public class StringAllLogics {
	
	
	public String stringReverse(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)     //1.  t+blank= t  2. h+t =ht  3. g+ht=ght
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	
	public void palindromeCheck(String given,String rev)
	{
	
		if(given.equalsIgnoreCase(rev))
		{
			System.out.println(given+ " Given String is a palindrome");
		}
		else
		{
			System.out.println(given+ " Given String is not a palindrome");
		}
	}
	
	public boolean compareString(String given,String rev)
	{
		boolean b=false;
		if(given.equalsIgnoreCase(rev))
		{
			b=true;
		}
		return b;
	}
	
	
	
	public void palCheck(String given)
	{
		String rev=stringReverse(given);
		//palindromeCheck(given,rev);
		if(compareString(given,rev))
		{
			System.out.println(given+ " Given String is a palindrome");
		}
		else
		{
			System.out.println(given+ " Given String is not a palindrome");
		}
	}

	public void reportCharacterType(String str)
	{
		int alpha=0,num=0,spl=0,uCase=0,lCase=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				if(Character.isUpperCase(str.charAt(i)))
				{
					uCase++;
				}
				else
				{
					lCase++;
				}
				alpha++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			else
			{
				spl++;
			}
		}
		System.out.println("Total alphabets are "+alpha);
		System.out.println("Upper cases are " +uCase);
		System.out.println("Lower cases are "+lCase);
		System.out.println("Total numbers are "+num);
		System.out.println("Total spl charecters are "+spl);
		int total=alpha+num+spl;
		if(str.length()==total)
		{
			System.out.println("have coverd all charecters");
		}
		else
		{
			System.out.println("check the logic you have missed something");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
