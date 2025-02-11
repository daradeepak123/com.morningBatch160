package windowLearn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class WindowHandleLearn {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com");
	
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		
		Set<String> tabs=driver.getWindowHandles();
		for(String t:tabs)
		{
			System.out.println(t);
			
			if(!t.equals(parent))
			{
				driver.switchTo().window(t);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello@gmail.com");
			}
			
		}
		
		
		Thread.sleep(4000);
	
		driver.quit();
		
	}

}
