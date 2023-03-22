package reporters;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test1() {
		Reporter.log("This is test1");
		System.out.println("This is test1");
	}
	@Test
	public void test2() {
		Reporter.log("This is test2");
		System.out.println("This is test2");
	}
	@Test
	public void test3() {
		Reporter.log("This is test3");
		System.out.println("This is test3");
	}
	@Test
	public void test4() {
		Reporter.log("This is test4");
		System.out.println("This is test4");
	}
}
