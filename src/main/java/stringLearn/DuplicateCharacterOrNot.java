package stringLearn;

public class DuplicateCharacterOrNot {

	public static void main(String[] args) {
		String str="charater";
		char ch=str.charAt(0);
		int lIndex=0,fIndex=0;
		fIndex=str.indexOf(ch);
		lIndex=str.lastIndexOf(ch);
		if(fIndex==lIndex)
		{
			System.out.println(ch+ " is not getting duplicated");
		}
		else
		{
			System.out.println(ch+ " is getting duplicated");
		}
		
		

	}

}
