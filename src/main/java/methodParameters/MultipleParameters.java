package methodParameters;

public class MultipleParameters {
	
	public void details(String name,int age, int sal, char c,boolean b)
	{
		System.out.println("welcome "+name);
		System.out.println("your age is "+age);
		System.out.println("YOur salary is "+sal);
		System.out.println("Department is "+ c);
		System.out.println("currently working "+b);
	}
	
	

	public static void main(String[] args) {

		MultipleParameters o=new MultipleParameters();
		
		o.details("Ram", 21,200000, 'Q', true);
		

	}

}
