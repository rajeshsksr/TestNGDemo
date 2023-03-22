package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Thirdtestng {
	@Test
	@Parameters({"Firstname","Secondname"})	
	public void signup(String Firstname,String Secondname) {
		System.out.println("Facebook signup:"+(Firstname+Secondname));
	}
	
	@Test(groups = "regression")
	public void homePage() {
		System.out.println("Facebook home page");
	}
}
