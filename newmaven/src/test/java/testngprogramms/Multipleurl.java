package testngprogramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipleurl 
{
	WebDriver driver1,driver2,driver3,driver4;
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		driver1.findElement(By.name("q")).sendKeys("Lobo, the King of Currumpaw");
		driver1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver1.findElement(By.name("btnK")).click();
		Thread.sleep(20000);
		driver1.close();
		

	}
	@Test
	public void test2() throws InterruptedException
	{
		driver2=new ChromeDriver();
		driver2.get("https://www.saucedemo.com/");
		driver2.manage().window().maximize();
		driver2.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver2.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver2.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		driver2.close();
		
		
	}
	@Test
	public void test3() throws InterruptedException
	{
		driver3=new ChromeDriver();
		driver3.get("https://staging.dentobees.com/");
		driver3.manage().window().maximize();
		driver3.findElement(By.xpath("//input[@name='email']")).sendKeys("karan213@gmail.com");
		driver3.findElement(By.xpath("//input[@name='password']")).sendKeys("Karan@213");
		Thread.sleep(3000);
		driver3.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(3000);
		driver3.close();
		
		
	}
	
	
	
	
	@Test
	public void test4() throws InterruptedException
	{
		driver4=new ChromeDriver();
		driver4.get("https://knowledgemission.kerala.gov.in");
		driver4.manage().window().maximize();
		JavascriptExecutor javaObj=(JavascriptExecutor)driver4;
		javaObj.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		javaObj.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(5000);
		driver4.close();
			
	}

}
