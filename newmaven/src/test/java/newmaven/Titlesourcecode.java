package newmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titlesourcecode {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		String title=driver.getTitle();
		System.out.println("Title :   "+title);
		String Currenturl=driver.getCurrentUrl();
		System.out.println("CurrentUrl :"+Currenturl);
		String source=driver.getPageSource();
		System.out.println("Source Code : "+source);
		Thread.sleep(2000);
		driver.close();

	}

}
