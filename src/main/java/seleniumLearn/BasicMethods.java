package seleniumLearn;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicMethods {
	
	
	
	public static void selectVisibleText(WebElement ele,String value)
	{
		if(ele.isDisplayed() & ele.isEnabled())
		{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
		}
		else
		{
			System.out.println("not able to find/display element ");
			
		}
	}
	
	
	public static void clickEement(WebElement ele)
	{
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		if(b)
		{
			ele.click();
		}
		else {
			
			
		}
	}
	
	public static void sendDataTextBox(WebElement ele,String data)
	{
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
	
		if(b)
		{
			ele.clear();
			ele.sendKeys(data);
		}
	}
	
	
	public static String textValidationAndRetrive(WebElement ele)
	{
		
		WebElement forPWD=ele;
		
		boolean bool=forPWD.isDisplayed();
		bool&=forPWD.isEnabled();
		System.out.println(bool);
		if(bool)
		{
		String heading=forPWD.getText();
		
		Dimension d= forPWD.getSize();
		System.out.println(d.height+"      "+d.width);
		
		Point p=  forPWD.getLocation();
		System.out.println(p.x+"       "+p.y);
		
		System.out.println(heading);
		return heading;
		}
		return "";
	}
	
	public static void checkCheckBox(WebElement ele)
	{
		if(ele.isDisplayed() & ele.isEnabled() & !ele.isSelected())
		{
			ele.click();
		}
	}
		
	
	public static WebDriver openBrowser(WebDriver driver , String url)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired browser");
		String browser=sc.next();
		if(browser.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {

			driver=new EdgeDriver();
		}
		else  
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);		
		return driver;
		
	}
	
	
	

}
