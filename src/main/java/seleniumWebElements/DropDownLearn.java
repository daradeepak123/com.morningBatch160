package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumLearn.BasicMethods;

public class DropDownLearn {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/dropdown");

		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		BasicMethods.selectVisibleText(dw, "Option 2");
		Thread.sleep(4000);
		Select sel=new Select(dw); 
				
		
		
		sel.selectByValue("1");
		Thread.sleep(4000);
		sel.selectByIndex(2);
		Thread.sleep(4000);
		driver.quit();

	}

}
