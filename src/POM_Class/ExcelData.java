package POM_Class;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public static String getdata(String filepath,String sheetname,int rn,int cn)
	{
		try
		{
			FileInputStream fis = new FileInputStream(filepath);
			Workbook wb = WorkbookFactory.create(fis);
			Row r = wb.getSheet(sheetname).getRow(rn);
			String data = r.getCell(cn).getStringCellValue();
			return data;
		}
		catch(Exception ex)
		{
			return " ";
		}
	}

}
