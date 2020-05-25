package practise.AppiumFramework;

import org.testng.annotations.Test;

public class testNGdemo2 {
	@Test(dependsOnMethods= {"demo2"})
	public void demo() {
		System.out.println("demo2");
	}
	
	@Test(groups= {"smoke"})
	public void demo2() {
		System.out.println("demo3Smoke");
	}
}
