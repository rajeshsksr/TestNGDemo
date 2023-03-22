package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import reusable.BaseClass;



public class EnabledDemoForListeners extends BaseClass{
	
	@Test
	public void signin() {
		System.out.println("This is signin log");
		BaseClass.launchBrowser();
		BaseClass.geturl("https://www.ebay.com");
		BaseClass.maximize();
		Assert.assertTrue(false);
	}

}
