package practise.AppiumFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class seipedemo extends base1{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		WebElement hell1 = driver.findElementByXPath("//*[@content-desc='2']");
		WebElement hell2 = driver.findElementByXPath("//*[@content-desc='8']");

		//long press //on element //2 sec // move to another element and you release
		TouchAction t =new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(hell1)).withDuration(ofSeconds(4))).moveTo(element(hell2)).release().perform();
	}
}
