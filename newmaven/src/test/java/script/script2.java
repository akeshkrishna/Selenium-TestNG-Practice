package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pom2;

public class script2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		pom2.username(driver).sendKeys("standard_user");
		pom2.password(driver).sendKeys("secret_sauce");
		pom2.login(driver).click();
		Thread.sleep(3000);
		driver.close();

	}

}
