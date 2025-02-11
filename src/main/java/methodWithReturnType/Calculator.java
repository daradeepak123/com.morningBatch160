package methodWithReturnType;

public class Calculator {


	public void add()
	{
		System.out.println(100+100);
	}
	
	
	public int add(int x, int y)
	{
		int a=x,b=y,c;
		return c=a+b;
	}
	
	public int add(int x, int y,int z)
	{
		int a=x,b=y,c;
		return c=a+b+z;
	}
	
	public double div(float a,int b)
	{
		System.out.println(a/b);
		return a/b;
	}
	

}
