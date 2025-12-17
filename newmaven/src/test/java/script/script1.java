package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pom1;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     ChromeOptions options=new ChromeOptions();
     driver.get("https://www.google.com/");
    
     pom1.googlesearch(driver).sendKeys("birds");
 	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
     pom1.searchbutton(driver).click();
     Thread.sleep(3000);
     driver.close();
	}

}
