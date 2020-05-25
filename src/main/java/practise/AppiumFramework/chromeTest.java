package practise.AppiumFramework;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class chromeTest extends base1{
public static void main(String[] args) throws MalformedURLException {
	AndroidDriver<AndroidElement> driver = capabilities();
	//WebDriver driver = capabilities();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.findElementByAndroidUIAutomator("text(\"Log In\")").click();
	//driver.findElementByXPath("//div/button[contains(text(),'Log In')]").click();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.findElementByXPath("//label/span/following-sibling::input[@name='username']").sendKeys("beard_fever");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByXPath("//label/span/following-sibling::input[@name='password']").sendKeys("Am@nAm@n");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByXPath("//button/div[contains(text(),'Log In')]").click();
	

}
}
