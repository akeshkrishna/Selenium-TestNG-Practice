package testngprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderclass 
{
	@Test(dataProvider ="dp")
	public void test1(String s,String n) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys(s);
		driver.findElement(By.name("password")).sendKeys(String.valueOf(n));
		driver.findElement(By.name("btnLogin")).click();
	
		driver.close();
	}
 @DataProvider
 public Object[] dp()
		 {
	 		return new Object[][]
	 				{
	 					{"mngr26593","123Abc@"},
	 					{"mngr609132","EtEjynA"},
	 					{"mngr26593","12!@"}
	 				};
	 		
	 			
	 		}
	 
	 
	 
		 
}
