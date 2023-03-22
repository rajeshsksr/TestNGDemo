package attributesOfAnnotations;

import org.testng.annotations.Test;

public class Attributesofannotations1 {
	
	@Test(priority=-3)
	public void homePage() {
		System.out.println("Facebook home");
	}
	
	@Test(groups = "regression")
	public void profileview() {
		System.out.println("My profile");
	}
	
	@Test(priority=-1)
	public void login() {
		System.out.println("Facebook login");
	}
	
	@Test(priority=0)
	public void signup() {
		System.out.println("Facebook signup");
	}
	
	@Test(priority=3)
	public void login1() {
		System.out.println("Facebook login123");
	}
}
	

