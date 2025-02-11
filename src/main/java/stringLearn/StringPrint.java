package stringLearn;

public class StringPrint {

	public static void main(String[] args) {

		String str="Welocme to QT";
		
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		
		
	}

}
