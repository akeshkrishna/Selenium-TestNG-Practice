package newmaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Writeexcel {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
	String filePath="C:\\Users\\Q TEST\\Desktop\\Writeexcel.xlsx";
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("Sheet1");
	
	String [][] data=
		{
				{"Username","Password","Message"},
				
				{"John","stjohns","Hello world"},
				{"David","Daviddavi","Hi All"},
				{"Sebastian","Sebu","Hey Bro"}
							
		};
		
		for(int i=0;i<data.length;i++)
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<data[i].length;j++)
			{
				
				XSSFCell cell=row.createCell(j);
				cell.setCellValue(data[i][j]);
				
				
			}
			
			
			
		}
		
		try(FileOutputStream fileOut=new FileOutputStream(new File(filePath)))
		{
			
			workbook.write(fileOut);
			System.out.println("The excel file written successfully"+filePath);
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			
		} 
		try {
			
			workbook.close();
			
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	

	}

}
