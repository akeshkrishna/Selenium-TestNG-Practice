package newmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertmessage {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		Alert alert=driver.switchTo().alert();
		String alrtmsg=driver.switchTo().alert().getText();
		System.out.println("Alert Message is"+alrtmsg);
		Thread.sleep(3000);
		alert.accept();
		alert.dismiss();
		driver.close();

	}

}
