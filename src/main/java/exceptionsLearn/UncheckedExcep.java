package exceptionsLearn;

public class UncheckedExcep {

	public static void main(String[] args) {

		String str="hello";
		try {
		System.out.println(str.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(str.charAt(1));

	}

}
