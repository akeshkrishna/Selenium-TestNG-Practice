package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom2 
{
 public static WebElement username(WebDriver driver)
 	{
	WebElement web=driver.findElement(By.id("user-name"));
	return web;
 	}
 public static WebElement password(WebDriver driver)
 {
 WebElement web=driver.findElement(By.id("password"));	
 return web;
 }
 public static WebElement login(WebDriver driver)
 {
	 WebElement web=driver.findElement(By.id("login-button"));
	 return web;
 }
}
