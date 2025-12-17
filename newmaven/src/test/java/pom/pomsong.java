package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomsong
{
	public static WebElement searchbar(WebDriver driver) 
	{
		WebElement web=driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input"));
		return web;
	}
	public static WebElement searchbutton(WebDriver driver)
	{
		WebElement web=driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/span/span/div"));
		return web;
		
	}
	public static WebElement thumbnail(WebDriver driver)
	{
		WebElement web=driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
		return web;
		
	}
}
