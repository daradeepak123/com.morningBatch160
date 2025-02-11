package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.LoginPage;
import utils.BrowserInvoke;
import utils.SeleniumHelper;

public class LoginTest extends BaseClass{
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	@BeforeClass
	public void openBrowser() throws Exception
	{
		driver=BrowserInvoke.openBrowser(driver, sheet.getRow(3).getCell(1).toString());
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}
	
	@Test
	public void login() throws Exception
	{

		Thread.sleep(3000);
		
		WebElement titlePage=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		Assert.assertEquals(titlePage.getText(), "Dashboard");
		
		
	}
	
	
	
	

}
