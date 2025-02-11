package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumHelper;

public class LoginPage {
	WebDriver ldriver;
	
	
	
	public LoginPage(WebDriver rdriver) {

		
		
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//input[@name='username']") 
	WebElement uname;

	@FindBy(xpath="//input[@name='password']")
	WebElement Pwd;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_btn;
	
	
	public void login()
	{		
		SeleniumHelper.sendDataTextBox(uname, "Admin");
		SeleniumHelper.sendDataTextBox(Pwd, "admin123");
		SeleniumHelper.clickEement(login_btn);
	
	}
	
	
	
	

}
