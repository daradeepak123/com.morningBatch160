package dataTypesVariables;

public class VariablesTypes {
	
	static int abc=100;
	int xyz=500;
	public static void hello()
	{
		System.out.println("this is hello method");
	}
	
	public void hi()
	{
		System.out.println("this is hi method");
	}

	public static void main(String[] args) {
		VariablesTypes obj=new VariablesTypes();
		int asd=4000;
		System.out.println(asd);
		System.out.println(abc);
		System.out.println(obj.xyz);
		hello();
		obj.hi();
		obj.metNew();
	}
	
	public void metNew()
	{
		System.out.println(abc);
		System.out.println(xyz);
		hello();
		hi();
	}

}
