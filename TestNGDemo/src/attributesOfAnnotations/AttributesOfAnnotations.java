package attributesOfAnnotations;

import org.testng.annotations.Test;

public class AttributesOfAnnotations {
		
	@Test(description = "hello testng")
	public void homePage() {
		System.out.println("Facebook home");
	}
	
	@Test(dependsOnMethods = ("login"))
	public void profileview() {
		System.out.println("My profile");
	}
		
	@Test(priority = 1)
	public void login() {
		System.out.println("Facebook login");
	}
	
	@Test(enabled = false)
	public void signup() {
		System.out.println("Facebook signup");
	}
	
}
	