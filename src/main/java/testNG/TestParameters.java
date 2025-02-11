package testNG;

import org.testng.annotations.Test;

public class TestParameters {
	
	
	
	@Test(priority = 4,description = "this is basic desc")
	public void testMet()
	{
		System.out.println("this is test metod 1");
	}
	
	@Test(priority = 2,dependsOnMethods = "testMet")
	public void testMet1()
	{
		System.out.println("this is test metod 2");
	}
	
	@Test(priority = 1,enabled = true)
	public void testMet2()
	{
		System.out.println("this is test metod 3");
	}
	
	@Test(priority = 3)
	public void testMet3()
	{
		System.out.println("this is test metod 4");
	}
	
	@Test(priority = 5)
	public void testMet4()
	{
		System.out.println("this is test metod 5");
	}
	
	@Test(priority = 6)
	public void testMet5()
	{
		System.out.println("this is test metod 5");
	}
	
	
	

}
