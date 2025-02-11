package objectsLearn;

public class ObjectMapping2 {
	
	int abccc=500;
	
	public static void main(String args[])
	{
		ObjectMapping1 obj=new ObjectMapping1();
		System.out.println(obj.a);
		
		System.out.println(ObjectMapping1.b);
		
		
		ObjectMapping2 obj2=new ObjectMapping2();
		obj2.abccc=10;
		System.out.println(obj2.abccc);
	}
	

}
