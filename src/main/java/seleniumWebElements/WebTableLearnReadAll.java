package seleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class WebTableLearnReadAll {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com/tables");

		
		int row=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr")).size();

		int col=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td")).size();
		
		System.out.println(row+"\t"+col);
		
		for(int i=1;i<=col;i++)
		{
			String s=driver.findElement(By.xpath("//table[@id='table1']//thead//tr//th["+i+"]//span")).getText();
			System.out.print(s+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				
				String s=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]//td["+j+"]")).getText();
				if(s.equals("John"))
				System.out.print(s+"\t");
				
			}
			System.out.println();
			
		}
		
		
		
		
		driver.quit();
		
		
	}

}
