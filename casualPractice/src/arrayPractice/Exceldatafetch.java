package arrayPractice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatafetch 
{
	public static void getdata(String path,int sheetno, int rowno, int colno)
	{
		try 
		{
			String value;
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
			System.out.println(value);
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) 
	{
		String path="C:\\Users\\Tariq\\eclipse-workspace\\casualPractice\\TestcasesTextBox.xlsx";
		getdata(path,0,1,1);
	}
}
