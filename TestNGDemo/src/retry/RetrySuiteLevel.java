package retry;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusable.BaseClass;

public class RetrySuiteLevel {

	@Test
	public void demo() {		
		BaseClass.geturl("https://www.ebay.com");
		Assert.assertTrue(false);	
	}
	@BeforeTest
	public void driver() {
		BaseClass.launchBrowser();
	}
}
