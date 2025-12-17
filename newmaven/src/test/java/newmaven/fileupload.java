package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		String filepath="C:\\Users\\Q TEST\\Desktop\\Dentobees\\PatientProfile_TestCases.csv";
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Q TEST\\Desktop\\Dentobees\\PatientProfile_TestCases.csv");
		driver.findElement(By.id("file-submit")).click();
		
		String text=driver.findElement(By.tagName("h3")).getText();
		System.out.println("Upload status   "+text);
		driver.quit();
	}

}
