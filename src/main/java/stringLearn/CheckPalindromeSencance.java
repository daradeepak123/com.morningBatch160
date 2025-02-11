package stringLearn;

public class CheckPalindromeSencance {

	public static void main(String[] args) {
		StringAllLogics al=new StringAllLogics();
		 String str="mom and dad are going to meet madam";
	       String words[]=str.split(" ");
	       int pCount=0,nCount=0;
	       for(String s:words)
	       {
	           //System.out.println(s);
	           
	           
	           al.palCheck(s);
	           
//	           String rev="";
//	           
//	           for(int i=s.length()-1;i>=0;i--)
//	           {
//	               rev=rev+s.charAt(i);
//	           }
//	           if(s.equals(rev))
//	           {
//	               System.out.println(s+ " is a palindrome");
//	               pCount++;
//	           }
//	           else
//	           {
//	               System.out.println(s+ " is not a palindrome");
//	               nCount++;
//	           }
	           
	           
	       }
	       System.out.println("total palindromes are "+pCount);
	       System.out.println("total palindromes are "+nCount);
	          

	}

}
