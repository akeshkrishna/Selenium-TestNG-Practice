package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom1 {
	public static WebElement googlesearch(WebDriver driver)
	{
		WebElement web=driver.findElement(By.name("q"));
		return web;}
	public static WebElement searchbutton(WebDriver driver)
	{
		WebElement element=driver.findElement(By.name("btnK"));
		return element;
	}

}
