package excelUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataManagement {

	public static void main(String[] args) throws IOException {
		File file=new File(System.getProperty("user.dir")+"/dataFiles/employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		String data=sheet.getRow(0).getCell(0).toString();
		System.out.println(data);
		
	
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum()-1;
		
		System.out.println(row);
		System.out.println(col);
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				data=sheet.getRow(i).getCell(j).toString();
				System.out.print(data+"\t");
			}	
			System.out.println();
		}
		
		
		
		

	}

}
