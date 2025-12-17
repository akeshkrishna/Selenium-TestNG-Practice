package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment 
{
	WebDriver driver1,driver2,driver3,driver4;
	@Test
	public void hometitlecheck() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.get("http://live.techpanda.org/");
		driver1.manage().window().maximize();
		
		String Expectedtitle="Home page";
		String Actualtitle=driver1.getTitle();
		assertEquals(Actualtitle, Expectedtitle);
		Thread.sleep(3000);
		driver1.close();
		
		}
	
	
	@Test
	public void mobileclick() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver2=new ChromeDriver();
		driver2.get("http://live.techpanda.org/");
		driver2.manage().window().maximize();
		driver2.findElement(By.className("level0")).click();
		Thread.sleep(3000);
		driver2.close();
		
	}
	
	
	@Test
	public void mobiletitlecheck() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver3=new ChromeDriver();
		driver3.get("http://live.techpanda.org/");
		driver3.findElement(By.className("level0")).click();
		driver3.manage().window().maximize();
		
		String Expectedtitle="Mobile";
		String Actualtitle=driver3.getTitle();
		assertEquals(Actualtitle, Expectedtitle);
		Thread.sleep(3000);
		driver3.close();
		
		} 


		@Test
		public void dropdownselection() throws InterruptedException
		{
		driver4=new ChromeDriver();
		driver4.get("https://live.techpanda.org");
		driver4.manage().window().maximize();
		driver4.findElement(By.xpath("//a[text()='Mobile']")).click();
		Select dropDown=new Select(driver4.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")));
		dropDown.selectByVisibleText("Name");
		Thread.sleep(2000);
		driver4.close();
		} 
	
	
	
	
}
	
	
	
	
	


