package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titlecheck
{
public String baseurl="https://www.browserstack.com/";
public WebDriver driver;
@BeforeTest
public void launchbrowser()
{
	System.out.println("Launching Chrome Browser");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void verifyhomepagetitle()
{
	String Expectedtitle="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	String Actualtitle=driver.getTitle();
	assertEquals(Actualtitle, Expectedtitle);
}
	
 @AfterTest
 public void teminatebrowser()
 {
	 driver.close();
 }
}
	
	

