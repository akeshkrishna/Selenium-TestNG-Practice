package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttoncheckbox {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1=driver.findElement(By.name("webform"));
		WebElement radio2=driver.findElement(By.name("webform"));
		radio1.click();
		System.out.println("Radio Button 1 Is Selected");
		radio2.click();
		System.out.println("Radio Button 2 is selected");
		WebElement Checkbox1=driver.findElement(By.id("vfb-6-0"));
		WebElement Checkbox2=driver.findElement(By.id("vfb-6-1"));
		Checkbox1.click();
		if(Checkbox2.isSelected())
		{
			System.out.println("Checkbox2 Is Selected");
		}
		
		
		
		
		else
			System.out.println("Checkbox1 Is Selected");
		Thread.sleep(3000);
		driver.close();
	}

}
