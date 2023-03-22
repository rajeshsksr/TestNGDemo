package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider="userdata")
	
	private void facebooktest(String name,String password) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
//	driver.manage().window().maximize();
	
	WebElement emailElement=driver.findElement(By.id("email"));
	emailElement.sendKeys(name);									
	
	WebElement passElement=driver.findElement(By.id("pass"));
	passElement.sendKeys(password);
	
	WebElement loginButton=driver.findElement(By.name("login"));
	loginButton.click();
																	
	}
	
	@org.testng.annotations.DataProvider(name="userdata")
	private Object[][] testcase()
	{
		Object[][] objname=new Object[][] {
			{"hello@gmail.com","123@43sd"},
			{"ram67@gmail.com","jewcbe67"},
			{"kumar@gmail.com","hj*&^jd"}
		};
	return objname;	
	}
}
							