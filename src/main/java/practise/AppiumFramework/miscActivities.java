package practise.AppiumFramework;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class miscActivities extends base1{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		System.out.println(driver.currentActivity());
		System.out.println(driver.getAutomationName());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
