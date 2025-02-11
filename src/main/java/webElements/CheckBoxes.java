package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class CheckBoxes {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/checkboxes");
		
		List<WebElement> chkBoxes=driver.findElements(By.xpath("//input"));
		

		for(WebElement ele:chkBoxes)
		{
			if(!ele.isSelected())
			{
				ele.click();
			}
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
