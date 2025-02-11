package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumLearn.BasicMethods;

public class TestNGLearn {

	static WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/checkboxes");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	@Test
	public void testMethod() throws Exception
	{
		

		List<WebElement> chkBoxes=driver.findElements(By.xpath("//input"));


		for(WebElement ele:chkBoxes)
		{
			if(!ele.isSelected())
			{
				
			}
		}

		Thread.sleep(3000);

		
	}




	@Test
	public void testMethod1() throws Exception
	{
		

		List<WebElement> chkBoxes=driver.findElements(By.xpath("//input"));


		for(WebElement ele:chkBoxes)
		{
			if(!ele.isSelected())
			{
				ele.click();
			}
		}

	

		
	}



	@Test
	public void testMethod2() throws Exception
	{
		

		List<WebElement> chkBoxes=driver.findElements(By.xpath("//input"));


		for(WebElement ele:chkBoxes)
		{
			if(!ele.isSelected())
			{
				System.out.println("Print data");
			}
		}

		
	}

}
