package testngDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;



public class FirstSetup {
	
	@Test
	public void launchpage1() {
		System.out.println("Amazon page");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
	}
	@Test(groups = "regression")
	public void launchpage2() {
		System.out.println("Facebook page");
		System.setProperty("webdriver.firefox.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
}
