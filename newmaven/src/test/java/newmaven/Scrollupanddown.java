package newmaven;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollupanddown 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://knowledgemission.kerala.gov.in");
		driver.manage().window().maximize();
		JavascriptExecutor javaObj=(JavascriptExecutor)driver;
		javaObj.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		javaObj.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
