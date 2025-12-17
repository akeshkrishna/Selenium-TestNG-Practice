package newmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
         List<WebElement>alllinks=driver.findElements(By.tagName("a"));
         int a=alllinks.size();
         System.out.println(a);
         for(WebElement link:alllinks)
         {
        	 System.out.println(link.getText());
         }

	}

}
