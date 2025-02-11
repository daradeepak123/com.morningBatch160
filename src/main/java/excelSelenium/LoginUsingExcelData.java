package excelSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumLearn.BasicMethods;

public class LoginUsingExcelData {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		File file=new File(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");

		String creds[]=new String[2];
		creds[0]=sheet.getRow(0).getCell(0).toString();
		creds[1]=sheet.getRow(0).getCell(1).toString();
		String url=sheet.getRow(3).getCell(1).toString();
		
		driver=BasicMethods.openBrowser(driver, url);
		
		WebElement uName=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement lgn=driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		
		BasicMethods.sendDataTextBox(uName, creds[0]);
		BasicMethods.sendDataTextBox(pwd, creds[1]);
		BasicMethods.clickEement(lgn);
		

		Thread.sleep(4000);
		driver.quit();
	}

}
