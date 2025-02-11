package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class WebTableLearn {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/tables");

		String name[]=new String[4];
		
		name[0]="John";
		name[1]="Frank";
		name[2]="Jason";
		name[3]="Tim";
		
		
		for(String a:name)
		{
			String user=driver.findElement(By.xpath("//table[@id='table1']//td[text()='"+a+"']")).getText();
			String userEdit=driver.findElement(By.xpath("//table[@id='table1']//td[text()='"+a+"']/following-sibling::td[4]/a[@href='#edit']")).getText();
			System.out.println(user+"\t"+userEdit);
		}
		
		
		driver.quit();
		
		
	}

}
