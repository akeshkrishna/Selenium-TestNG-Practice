package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2

{
	WebDriver driver1;
	@BeforeTest
	public void launchbrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.get("http://live.techpanda.org/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
	
		
	}
	@Test
	public void AddtoCart() throws InterruptedException
	{
		//driver1.findElement(By.className("level0")).click();
		driver1.findElement(By.linkText("MOBILE")).click();

		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
		Thread.sleep(2000);
		
		WebElement element=driver1.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
		element.clear();
		element.sendKeys("1000");
		Thread.sleep(2000);
		

		driver1.findElement(By.xpath("//*[@id='shopping-cart-table']//td[4]//button")).click();
		Thread.sleep(2000);
		
	    String ExpectedError="* The maximum quantity allowed for purchase is 500.";
		String ErrorMessage=driver1.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
	    assertEquals(ExpectedError,ErrorMessage);
        System.out.println(ErrorMessage);
	    Thread.sleep(2000);
		
		driver1.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
		Thread.sleep(2000);
		
		
		 WebElement emptyMsg = driver1.findElement(By.xpath("//div[@class='cart-empty']/p"));
	     String cartText = emptyMsg.getText();
	     System.out.println("Cart Message: " + cartText);

	       
	

	}
	
}
