package seleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumLearn.BasicMethods;

public class seleniumActionClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/drag_and_drop");

		Actions act=new Actions(driver);
		
		act.contextClick().build().perform();
		
		WebElement a=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement b=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		act.dragAndDrop(a, b).build().perform();
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
