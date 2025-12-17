package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dimension {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://swayam-sso.swayam2.ac.in/signin?response_type=code&client_id=swayam-central-production&redirect_uri=%2F&state=rjyoo47NOQ9QN5HXEdmBP1FvHuOpAE");
		org.openqa.selenium.Dimension dimen=driver.findElement(By.name("LogonIdentifier")).getSize();
		System.out.println("Height is   "+dimen.height);
		System.out.println("width  is   "+dimen.width);
		Thread.sleep(3000);
		driver.close();
	}

}
