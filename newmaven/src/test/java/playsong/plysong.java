package playsong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pomsong;

public class plysong {

	public static void song(WebDriver driver) throws InterruptedException
	{
		// TODO Auto-generated method stub
		pomsong.searchbar(driver).sendKeys("vettam song");
		pomsong.searchbutton(driver).click();
		Thread.sleep(3000);
		pomsong.thumbnail(driver).click();
		

		
		

	}

}
