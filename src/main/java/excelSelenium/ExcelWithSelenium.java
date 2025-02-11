package excelSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import seleniumLearn.BasicMethods;

public class ExcelWithSelenium {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		File file=new File(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("URLs");
		
		int row=sheet.getLastRowNum();
		
		String urls[]=new String[row+1];
		
		for(int i=0;i<=row;i++)
		{
			urls[i]=sheet.getRow(i).getCell(0).toString();
		}
		
		for(String s:urls)
		{
			
			driver=BasicMethods.openBrowser(driver, s);
			System.out.println(driver.getTitle()+"\t"+driver.getCurrentUrl());
			driver.quit();
		}
		
		
		
		
		
		

	}

}
