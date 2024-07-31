package utilitiespackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import basepackage.magnetobase;

public class excelmagneto extends magnetobase
{

	public static String getcellvalue(String pg,String sheet,int r,int c)
	{
		try
		{
			FileInputStream login= new FileInputStream(pg);
			XSSFWorkbook wb=new XSSFWorkbook(login);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getrowcount(String pg,String sheet)
	{
		try
		{
			FileInputStream login=new FileInputStream(pg);
			XSSFWorkbook wb=new XSSFWorkbook(login);
			return wb.getSheet(sheet).getLastRowNum();		
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	
	
}
