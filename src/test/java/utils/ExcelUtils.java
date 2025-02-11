package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	public XSSFSheet loadXlxsFile(String path,String sht) throws Exception
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sht);
		return sheet;
	}
	
	
	public String[][] retriveXLXSData(String path,String sheet) throws Exception
	{
		XSSFSheet sht=loadXlxsFile(path,sheet);
		
		
		int lastRow=sht.getLastRowNum();
		int lastColumn=sht.getRow(0).getLastCellNum();
		String dataaa[][]=new String[lastRow+1][lastColumn];

		for(int i=0;i<=lastRow;i++)
		{

			for(int j=0;j<lastColumn;j++)
			{
				DataFormatter dataFormatter = new DataFormatter();
				String formattedCellStr = dataFormatter.formatCellValue(sht.getRow(i).getCell(j));
				//System.out.print(formattedCellStr + "\t\t\t");
				dataaa[i][j]=formattedCellStr;
			}
		}
		return dataaa;
	}
	
	public String readPropFile(String path,String proper) throws Exception
	{
	File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		
		config.load(fis);
		
		String str=config.getProperty(proper);
		
		return str;
	}

}
