package newmaven;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Actions action=new Actions(driver);
		WebElement Fullname=driver.findElement(By.id("userName"));
		Fullname.sendKeys("Jospeh alex");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("Aj321@gmail.com");
		WebElement Currentaddress=driver.findElement(By.id("currentAddress"));
		Currentaddress.sendKeys("Bolgatty palace cochin ernakulam");
		
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		WebElement permenentaddress=driver.findElement(By.id("permanentAddress"));
		assertEquals(Currentaddress.getAttribute("value"), permenentaddress.getAttribute("value"));
		

	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}

}
