package assertation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void assertation( ) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	String driverurl=driver.getCurrentUrl();
	System.out.println("Url:"+driverurl);
	
	boolean inputvalue=driverurl.contains("facefhbook");
	System.out.println("Input:"+inputvalue);
	
	Assert.assertTrue(inputvalue,"This is the title test case");
	
	WebElement emailElement=driver.findElement(By.id("email"));
	emailElement.sendKeys("name");									
	
	WebElement passElement=driver.findElement(By.id("pass"));
	passElement.sendKeys("password");
	
	WebElement loginButton=driver.findElement(By.name("login"));
	loginButton.click();
								
}

}
