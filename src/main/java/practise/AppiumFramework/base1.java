package practise.AppiumFramework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.session.ChromeFilter;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base1 {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		File f = new File("src\\main\\java\\practise\\AppiumFramework");
		File fs = new File(f, "original.apk");
//		File fs = new File(f, "instagram-140-0-0-30-126.apk");
//		File fs = new File(f, "ecommerse.apk");
		AndroidDriver<AndroidElement> driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		//cap.setCapability("chromedriverExecutable", "D:\\Download New Things from Browser\\chromedriver_win32 (5)\\chromedriver.exe");
		//ask for virtual device name
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Shiva");
		//for real device we have to write below line instead of emulator name
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//ask for apk path
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//new step to use uiAutomator and its functionality
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//we have to pass server link as argument in android driver, invoking and setting up connection to appium server
		//we have to bound with capabilities
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
