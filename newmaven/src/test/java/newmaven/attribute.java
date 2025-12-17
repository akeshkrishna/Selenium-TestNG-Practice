package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class attribute {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Attribute=driver.findElement(By.name("pass")).getAttribute("class");
		System.out.println("Attribute Name:"+Attribute);
		String tagname=driver.findElement(By.name("pass")).getTagName();
		System.out.println("Tag name"+tagname);
		driver.close();

	}

}
