package seleniumFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class IframesLearn {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://demoqa.com/frames");
		
		
		driver.switchTo().frame("frame1");
		
		String data=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		
		System.out.println(data);
		driver.switchTo().defaultContent();
		data=driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
		System.out.println(data);
		driver.quit();
		

	}

}
