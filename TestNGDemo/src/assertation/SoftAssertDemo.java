package assertation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	
	@Test
	public void assertation() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	
	String expectedtitle="Electronics, Cars, Fashion, Collectibles & Mores | eBay";
	
	driver.get("https://www.ebay.com/");	
	String actualtitle=driver.getTitle();
	System.out.println("Verifying title");
	
	SoftAssert softast=new SoftAssert();
	softast.assertEquals(actualtitle, expectedtitle, "Title verfication passed");
	
	driver.findElement(By.id("gh-ac")).sendKeys("mobile",Keys.ENTER);
	softast.assertAll();
}
}

