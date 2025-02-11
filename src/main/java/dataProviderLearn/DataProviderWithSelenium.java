package dataProviderLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumLearn.BasicMethods;

public class DataProviderWithSelenium {
	
	WebDriver driver;
	
	@DataProvider(name="dp")
	public Object dataaaProvider()
	{
		
	
		 return new Object[][] { { "https://the-internet.herokuapp.com/", "//h1","The Internet" },
			 					 { "https://dequeuniversity.com/demo/", "(//h1)[1]","Demo Sites" }, 
			 					 { "https://oceanwp.org/demos/", "//h1","Demos" } };
	
	}
	
	@Test(dataProvider = "dp",enabled=true)
	public void dataRead(String ss,String sss,String s)
	{
		
		//driver=BasicMethods.openBrowser(driver, ss);
		driver=new ChromeDriver();
		driver.get(ss);
		driver.manage().window().maximize();
		
		String data=driver.findElement(By.xpath(sss)).getText();
		System.out.println(data);
		String title=driver.getTitle();
		if(title.contains(s))
		{
			System.out.println(title);
		}
		else
		{
			System.out.println("check the title is not corrent");
		}
		driver.quit();
		
	}
	
	
	
	
	
	
	

}
