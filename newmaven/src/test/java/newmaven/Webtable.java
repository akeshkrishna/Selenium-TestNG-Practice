package newmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Q TEST\\Desktop\\Webtable.html");
		
		List<WebElement>allRows=driver.findElements(By.xpath("//tr"));
		int totalrows=allRows.size();
		System.out.println("Total Number of rows in the table"+totalrows);
		
		List<WebElement>allColumns=driver.findElements(By.xpath("//th"));
		int totalcolumn=allColumns.size();
		System.out.println("Total Number of Columns Are"+totalcolumn);
		
		List<WebElement>allCells=driver.findElements(By.xpath("//th|//td"));
		int allcells=allCells.size();
		System.out.println("Total Number Of Cell is"+allcells);
		
		int sum=0;
		int countnumbervalue=0;
		for(WebElement cell : allCells)
		{
			String cellvalue=cell.getText();
			try
			{
				int number=Integer.parseInt(cellvalue);
				System.out.println("  "+number);
				countnumbervalue++;
				sum=sum+number;
			}
			catch (Exception e)
			{
				
				
			}
				
		}
		
		System.out.println("Total Count of Numerical value is"+countnumbervalue);
		System.out.println("Sum of the Total Numerical Value is"+sum);
		
		}

	}


