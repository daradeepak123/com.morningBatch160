package testClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageObjects.LoginPage;
import utils.BrowserInvoke;
import utils.SeleniumHelper;

public class DashBoardPageTC extends BaseClass{
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeClass
	public void login() throws Exception
	{
		driver=BrowserInvoke.openBrowser(driver, sheet.getRow(3).getCell(1).toString());
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
		
		Thread.sleep(3000);
		
		WebElement titlePage=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		Assert.assertEquals(titlePage.getText(), "Dashboard");
		
	}
	
	@BeforeMethod
	public void beOnDashBoardPage()
	{
		WebElement db=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		SeleniumHelper.clickEement(db);
	}
	
	@Test
	public void textValidation()
	{
		String data[]=new String[6];
		data[0]="Assign Leave";
		data[1]="Leave List";
		data[2]="Timesheets";
		data[3]="Apply Leave";
		data[4]="My Leave";
		data[5]="My Timesheet";
		
		List<WebElement> text=driver.findElements(By.xpath("//p[text()='Assign Leave']/../../..//p"));
		for(WebElement ele:text)
		{			
			String webData=ele.getText();
			boolean val=false;
			for(String s:data)
			{
				if(s.equals(webData))
				{
					val=true;
					break;
				}
			}
			Assert.assertEquals(val, true);
			
		}
		
	}
	
	
	@Test
	public void validateTimeAtWork()
	{
		//p[text()='Time at Work']
		WebElement work=driver.findElement(By.xpath("//p[text()='Time at Work']"));
		Assert.assertEquals(work.getText(), "Time at Work");
	}
	

}
