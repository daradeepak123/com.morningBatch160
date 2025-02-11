package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHelper {
	

	public static void selectVisibleText(WebElement ele,String value)
	{
		if(ele.isDisplayed() & ele.isEnabled())
		{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);
		}
		else
		{
			System.out.println("not able to find/display element ");
			
		}
	}
	
	
	public static void clickEement(WebElement ele)
	{
		try {
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
		if(b)
		{
			ele.click();
		}
		else {
			
			
		}
		}catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void sendDataTextBox(WebElement ele,String data)
	{
		boolean b=ele.isDisplayed();
		b&=ele.isEnabled();
	
		if(b)
		{
			ele.clear();
			ele.sendKeys(data);
		}
	}
	
	
	public static String textValidationAndRetrive(WebElement ele)
	{
		
		WebElement forPWD=ele;
		
		boolean bool=forPWD.isDisplayed();
		bool&=forPWD.isEnabled();
		System.out.println(bool);
		if(bool)
		{
		String heading=forPWD.getText();
		
		Dimension d= forPWD.getSize();
		System.out.println(d.height+"      "+d.width);
		
		Point p=  forPWD.getLocation();
		System.out.println(p.x+"       "+p.y);
		
		System.out.println(heading);
		return heading;
		}
		return "";
	}
	
	public static void checkCheckBox(WebElement ele)
	{
		if(ele.isDisplayed() & ele.isEnabled() & !ele.isSelected())
		{
			ele.click();
		}
	}

}
