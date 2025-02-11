package constructorLearn;

public class ConstructorPractical {
	
	int a;
	int b;
	String name;
	
	ConstructorPractical()
	{
		
	}
	
	void ConstructorPractical()
	{
		a=100;
		b=5000;
		name="QT";
	}
	
	ConstructorPractical(int x,int y)
	{
		a=x;
		b=y;
		name="QT";
	}
	
	
	

	public static void main(String[] args) {
		ConstructorPractical o=new ConstructorPractical();
		o.ConstructorPractical();
		System.out.println(o.a+o.b);
		System.out.println(o.name);
		
		
		
		ConstructorPractical o1=new ConstructorPractical();
		System.out.println(o1.a+o1.b);
		System.out.println(o1.name);
		
		
		ConstructorPractical o2=new ConstructorPractical(5000,1000);
		System.out.println(o2.a+o2.b);
		System.out.println(o2.name);
		
		
		
		
	}

}
