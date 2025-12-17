package testngprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplelogindiffcredentials
{

	WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider(name="testdata")
	public Object[][]getData()
	{
		return new Object[][]
				{
					{"user1","123"},{"user2","456"},{"user3","456"}
				};
	}
	
	
	@Test(dataProvider = "testdata")
	public void login(String username,String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
		
        
     /*  	 try 	
      * 		{
            		boolean errorMessageDisplayed = driver.findElement(By.xpath("//div")).isDisplayed();
            		Assert.isTrue(errorMessageDisplayed, "The expected error message for invalid credentials was not displayed.");
            
        		} 
        		catch (org.openqa.selenium.NoSuchElementException e)	
        		 {
        			Assert.("Did not find expected error message element. Login outcome is uncertain.");
        		  }
        
        */
        
        
        
        
        
        
        
	}
	
	@AfterMethod
	public void terminate()
	{
		
	 driver.quit();
	
	}
	
	
	
	
}
