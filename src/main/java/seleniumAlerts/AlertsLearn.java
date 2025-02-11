package seleniumAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class AlertsLearn {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alertBTN1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		BasicMethods.clickEement(alertBTN1);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		WebElement alertBTN2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		BasicMethods.clickEement(alertBTN2);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		WebElement alertBTN3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		BasicMethods.clickEement(alertBTN3);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
