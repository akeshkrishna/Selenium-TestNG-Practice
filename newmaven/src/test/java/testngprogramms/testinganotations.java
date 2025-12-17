package testngprogramms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testinganotations 
{
	
	@Test
	public void test1()
	{
		System.out.println("TestCase 1");
	}
	@Test
	public void test2()
	{
	   System.out.println("Testcase2");	
	}
	
@BeforeMethod
	public void Beforemethod()
	{
	System.out.println("Before Method");
	}
	@AfterMethod
	public void aftermethod()
	{
	System.out.println("After Method");
	}
	@AfterClass
	public void afterclass()
	{
		
		System.out.println("After class");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("Before suit");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Aftersuite");
	}













	
	

}
