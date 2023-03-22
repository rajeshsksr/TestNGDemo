package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

import reusable.BaseClass;

public class DemoClass {

	@Test(retryAnalyzer = retry.Retry.class)
	public void demo() {
		BaseClass.launchBrowser();
		BaseClass.geturl("https://www.ebay.com");
	//	BaseClass.maximize();
		Assert.assertTrue(false);
	
	}
}
