package windowLearn;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class OpenAllLinks {
	
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com");
		
		
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		
		for(WebElement link:ele)
		{
			String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
			link.sendKeys(clicklnk);
		}
		
		
		Set<String> tabs=driver.getWindowHandles();
		
		for(String t:tabs)
		{
			driver.switchTo().window(t);
			System.out.println(driver.getCurrentUrl());
		}
		
		driver.quit();
		
	}

}
