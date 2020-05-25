package practise.AppiumFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGdemo {
	@Parameters({"URL", "APIKey/username"})
	@Test(groups= {"smoke"})
	public void demo(String urlName, String key ) {
		System.out.println("helloSmoke");
		System.out.println(urlName);
		System.out.println(key);
	}
	//pass tag name and in value we have to pass method name
	//we can simply integrate dataprovider by passing method name
	@Test(dataProvider="getData")
	public void demo2(String username, String password) {
		System.out.println("by");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit history
		//2nd username password - no credit history
		//3rd fraudent credit history
		//create object with 3 coolum and 2 rows
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "FirstUserName";
		data[0][1] = "password";
		//2nd set
		data[1][0] = "FirstUserName";
		data[1][1] = "password";
		//3rd set
		data[2][0] = "FirstUserName";
		data[2][1] = "password";
		return data;
	}
}
