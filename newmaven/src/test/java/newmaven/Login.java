package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.close();
		
		WebDriverManager.chromedriver().setup();
		WebDriver log=new ChromeDriver();
		log.get("https://www.saucedemo.com/");
		log.manage().window().maximize();
		log.findElement(By.id("user-name")).sendKeys("locked_out_user");
		log.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		log.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		log.close();
		
		WebDriverManager.chromedriver().setup();
		WebDriver prob=new ChromeDriver();
		prob.get("https://www.saucedemo.com/");
		prob.manage().window().maximize();
		prob.findElement(By.id("user-name")).sendKeys("problem_user");
		prob.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		prob.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		prob.close();
	}

}
