package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import seleniumLearn.BasicMethods;

public class DateTimePickerSpiceJet {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String month="March ";
		String date="25";
		driver=BasicMethods.openBrowser(driver, "https://www.spicejet.com/");
		Thread.sleep(3000);
		WebElement cal=driver.findElement(By.xpath("//div[text()='Departure Date']/following-sibling::div"));
		WebElement datee=driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/following-sibling::div[2]//div[text()='"+date+"']"));
//		driver.findElement(By.xpath("//div[text()='Departure Date']/following-sibling::div")).click();
//		driver.findElement(By.xpath("//div[text()='"+month+"']/parent::div/following-sibling::div[2]//div[text()='"+date+"']")).click();
		BasicMethods.clickEement(cal);
		BasicMethods.clickEement(datee);
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
