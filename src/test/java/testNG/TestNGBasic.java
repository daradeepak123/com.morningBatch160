package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	WebDriver driver;
	String URL="https://the-internet.herokuapp.com/";
	List<WebElement> ele;
	@BeforeSuite
	public void bSuite()
	{
		
		
	}
	
	@BeforeTest
	public void bTest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void bClass()
	{
		driver.get(URL);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
	ele=driver.findElements(By.xpath("//a"));
	}
	@Test
	public void testMet()
	{
		
		for(WebElement e:ele)
		{
			System.out.println(e.getText());
		}
	}
	
	@Test
	public void checkTitle()
	{
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	}
	
	@Test
	public void checkSubTitle()
	{
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
	}
	
	@Test
	public void testMet2()
	{
		for(WebElement e:ele)
		{
			System.out.println(e.getText()+"\t"+e.getText());
		}
	}
	
	
	
	@AfterMethod
	public void aMethod()
	{
		
	}
	
	@AfterClass
	public void aClass()
	{
		
	}
	
	@AfterTest
	public void aTest()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void aSuite()
	{
		
	}
	
	
	
	
	

}
