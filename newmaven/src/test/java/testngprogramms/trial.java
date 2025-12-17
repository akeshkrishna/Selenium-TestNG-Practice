package testngprogramms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trial
{
WebDriver driver;
    
  
    	    @BeforeMethod
    		public void launchbrowser()
    		{
    			WebDriverManager.chromedriver().setup();
    			driver = new ChromeDriver(); 
    			driver.manage().window().maximize();
    	        // Adding a basic implicit wait to help with overall element finding
    	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
    		}
    	    
    	    @AfterMethod
    		public void terminate() throws InterruptedException // Added exception for Thread.sleep below
    		{
    	        // Add a manual sleep here just so you can visually see the outcome before closing
    	        Thread.sleep(2000); 
    	        if (driver != null) {
    			    driver.quit(); 
    	        }
    		}

    	    @DataProvider(name ="dp")
    	    public Object[][] dp()
    	    {
    	        return new Object[][]
    	        {
    	            {"mngr26593","123Abc@"},
    	            {"mngr609132","EtEjynA"},
    	            {"mngr26593","12!@"}
    	        };
    	    }
    		
    		@Test(dataProvider ="dp")
    		public void test1(String username,String password)
    		{
    	        driver.get("demo.guru99.com"); 
    	     
    	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	        WebElement userIdField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("uid")));
    	        
    	        userIdField.sendKeys(username);
    			driver.findElement(By.name("password")).sendKeys(password); 
    			driver.findElement(By.name("btnLogin")).click(); 
    	    }
    	}


