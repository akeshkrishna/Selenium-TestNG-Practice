package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabtwo 
{
	 String baseurl="https://www.saucedemo.com/";
	 WebDriver driver;
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("Launching Chrome Browser");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void verifylogo() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String firstlogo="Swag Labs";
		String secondlogo=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		assertEquals(firstlogo,secondlogo);
		Thread.sleep(3000);
	}
		
	 @AfterTest
	 public void teminatebrowser()
	 {
		 driver.close();
	 }
}
