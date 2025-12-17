package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dentobelogin {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

         WebDriverManager.chromedriver().setup();
         WebDriver driver3=new ChromeDriver();
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

}

