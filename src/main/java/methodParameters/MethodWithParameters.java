package methodParameters;

public class MethodWithParameters {
	
	public static void add(int x,int y)
	{
		int a=x,b=y;
		int c=a+b;
		System.out.println(c);

	}
	
	// i can add only 100 and 1000 only

	public static void main(String[] args) {

		add(0,1);  // 0 1
		add(100,100);  // 100 100
		add(0,0);  // 0 0 
		add(1000,1000);  // 1000 1000
		add(2000,1000);  // 2000 1000
	}

}
