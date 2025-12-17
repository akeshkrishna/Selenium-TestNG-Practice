package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabs 
{
	
 
	
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.id("user-name")).sendKeys("standard_user");
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		driver1.findElement(By.id("login-button")).click();
		String firstlogo="Swag Labs";
		String secondlogo=driver1.findElement(By.xpath("//div[@class='app_logo']")).getText();
		assertEquals(firstlogo,secondlogo);
		//System.out.println(secondlogo);
	
	
		driver1.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
