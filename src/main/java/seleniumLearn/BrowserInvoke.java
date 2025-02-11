package seleniumLearn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired browser");
		String browser=sc.next();
		if(browser.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {

			driver=new EdgeDriver();
		}
		else  
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String cURL=driver.getCurrentUrl();
		System.out.println(cURL);
		
		String pSource=driver.getPageSource();
		//System.out.println(pSource);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
