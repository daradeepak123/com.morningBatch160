package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class CheckBoxLearn {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/checkboxes");

		WebElement chk1=driver.findElement(By.xpath("(//input)[1]"));
		WebElement chk2=driver.findElement(By.xpath("(//input)[2]"));
		
		BasicMethods.checkCheckBox(chk1);
		BasicMethods.checkCheckBox(chk2);
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
