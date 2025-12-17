package newmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		
		FileInputStream file=new FileInputStream(new File("C:\\Users\\Q TEST\\Desktop\\Readexcel.xlsx"));
         XSSFWorkbook workbook=new XSSFWorkbook(file);
         XSSFSheet sheet=workbook.getSheetAt(0);
         
         for(int i=1;i<=sheet.getLastRowNum();i++)
         {
        	 
        	String username=sheet.getRow(i).getCell(0).getStringCellValue();
        	String password=sheet.getRow(i).getCell(1).getStringCellValue();
        	String message=sheet.getRow(i).getCell(2).getStringCellValue();
        	
        	
        	System.out.println("Username  is  "+username);
        	System.out.println("Password  is  "+password);
        	System.out.println("Message  is   "+message);
        	
         }
         workbook.close();
         file.close();

	}

}
