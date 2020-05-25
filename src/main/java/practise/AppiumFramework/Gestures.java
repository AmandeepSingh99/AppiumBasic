package practise.AppiumFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Gestures extends base1{
public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = capabilities();
	//perform long press operstion in appium or press and hold for some time
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	//Tap
	//touchaction is class is used to perform tap operation and gasture
	//used to perform operation with mobile gesture
	TouchAction t = new TouchAction(driver);
	//tap element based on coordinate and locator(xpath)
	//import tapOptions() method manually
	WebElement expandlist = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
	t.tap(tapOptions().withElement(element(expandlist))).perform();
	driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
	WebElement longpres = driver.findElementByAndroidUIAutomator("text(\"People Names\")");

	t.longPress(longPressOptions().withElement(element(longpres)).withDuration(ofSeconds(2))).release().perform();
	System.out.println(driver.findElementById("android:id/title").isDisplayed());
	
	
}

}
