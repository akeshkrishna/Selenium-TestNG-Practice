package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyclass {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
	
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.medlablive.in");
		driver.findElement(By.id("user_name")).sendKeys("demo");
		WebElement elementuser=driver.findElement(By.id("user_name"));
		elementuser.sendKeys(Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("demo1212");
		elementuser.sendKeys(Keys.TAB);
		WebElement elementpass=driver.findElement(By.id("password"));
		elementpass.sendKeys(Keys.TAB);
		WebElement elementclick=driver.findElement(By.id("b_login"));
		elementclick.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
				

}
}
