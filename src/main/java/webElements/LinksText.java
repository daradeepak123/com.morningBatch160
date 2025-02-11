package webElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class LinksText {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=BasicMethods.openBrowser(driver, "https://the-internet.herokuapp.com");
		
//		WebElement abLink=driver.findElement(By.xpath("//a[text()='A/B Testing']"));
//		String abData=abLink.getText();
//		System.out.println(abData);
//		
//		WebElement addRemoveLink=driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
//		String addRemoveLinkData=addRemoveLink.getText();
//		System.out.println(addRemoveLinkData);
		
		
		
		List<Integer> ii=new ArrayList<Integer>();
		
		ii.add(0);
		ii.add(2);
		ii.add(2);
		ii.add(3);
		ii.add(4);
		ii.add(5);
		
		for(int i:ii)
		{
			System.out.println(i);
		}
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
//		System.out.println(links.size());
		
		for(WebElement ele:links)
		{
			//System.out.println(ele.getText()  +"\t"+ ele.getAttribute("href"));
			if(ele.getText().equals("A/B Testing"))
			{
				ele.click();
				driver.navigate().back();
			}
			
			
		}
		
		
		
		driver.quit();
		
		

	}

}
