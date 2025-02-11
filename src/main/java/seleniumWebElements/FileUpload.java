package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class FileUpload {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/upload");
		System.out.println(System.getProperty("user.dir"));
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
