package reporters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import reusable.BaseClass;

public class ListenersForReporter extends BaseClass implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is  :"+result.getName());
		System.out.println("This is onTeststart log");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is  :"+result.getStatus());
		System.out.println("This is onTestSuccess log");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This is onTestFailure log");
		try {
			BaseClass.screenShot();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This is onTestSkipped log");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This is onTestFailedButWithinSuccessPercentage log");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("This is onTestFailedWithTimeout log");
	}

	public void onStart(ITestContext context) {
		System.out.println("This is onStart log");
	}

	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish log");
	}

}
