package exceptionsLearn;

public class ExceptionsLearning {

	public static void main(String[] args) {

		int a=100;
		System.out.println(a+100);
		System.out.println(a*100);
		
		
		try {
		System.out.println(a/1);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println(a-10);
		
		
	}

}
