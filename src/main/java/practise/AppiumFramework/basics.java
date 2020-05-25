package practise.AppiumFramework;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class basics extends base1{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xpath syntax
		//tagName[@attribute='value']
		//you can call the methods or variables of the class with object.
		HomePage h = new HomePage(driver);
		h.Preferences.click();
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//driver.findElementById("android:id/checkbox").click();
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		//driver.findElementByClassName("android.widget.EditText").sendKeys("enterSucessful");
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		//driver.findElementByClassName("android.widget.Button").get(1).click();
		//driver.findElementByAndroidUIAutomator("(attribute("value")");
		
		
	//hhh
		//validate the clickable feature for all options
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}
}
