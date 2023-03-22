package retry;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusable.BaseClass;

public class RetrysuiteClass2 {

	@Test
	public void demo2() {
		BaseClass.geturl("https://www.facebook.com");
		Assert.assertTrue(false);	
	}
	@BeforeTest
	public void driver() {
		BaseClass.launchBrowser();
	}
}
