package seleniumLearn;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementMethodsLearn {

	static WebDriver driver;
	static String url="https://the-internet.herokuapp.com/forgot_password";
	
	
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, url);
		
		
		WebElement forPWD=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		WebElement email=driver.findElement(By.xpath("//label[text()='E-mail']"));
		
		
		BasicMethods.textValidationAndRetrive(forPWD);
		BasicMethods.textValidationAndRetrive(email);
		
		
		WebElement emailTB=driver.findElement(By.xpath("//input[@id='email']"));
		BasicMethods.sendDataTextBox(emailTB,"hello@gmail.com");
		
		WebElement retPwdBTn=driver.findElement(By.xpath("//button"));
		retPwdBTn.click();
		
		WebElement errorMessage=driver.findElement(By.xpath("//h1"));
		BasicMethods.textValidationAndRetrive(errorMessage);
	
		Thread.sleep(4000);
		
		
		driver.quit();
	}

}
