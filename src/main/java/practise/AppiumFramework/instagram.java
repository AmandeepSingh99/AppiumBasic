package practise.AppiumFramework;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class instagram extends base1 {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.findElementByXPath("//div/button[contains(text(),'Log In')]").click();
		//driver.findElementByAndroidUIAutomator("text(\"Log In\")").click();
		driver.findElementsByClassName("android.widget.TextView").get(1).click();
	}
}
