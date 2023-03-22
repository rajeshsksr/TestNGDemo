package attributesOfAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import reusable.BaseClass;



public class EnabledDemo {
	
	Boolean datasetup=true;
	
//	@Test(enabled=false)
//	public void login() {
//		System.out.println("Facebook login");
//	}
	@Test
	public void signin() {
		System.out.println("This is signin log");
		BaseClass.launchBrowser();
		BaseClass.geturl("https://www.ebay.com");
		BaseClass.maximize();
		Assert.assertTrue(false);
	}
//	@Test
//	public void skipTest1() {
//		System.out.println("Skipping this test as it is not complete");
//		throw new SkipException("Skipping this test");
//	}
		
//	@Test
//	public void skipTest2() {
//		System.out.println("Skipping this test based on condition");
//		if(datasetup==true)
//		{
//			System.out.println("Execute the test");
//		}
//		else
//		{
//			System.out.println("Do not execute further steps");
//			throw new SkipException("Do not execute further steps");
//		}
//	}
	
}
