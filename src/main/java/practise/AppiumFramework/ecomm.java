package practise.AppiumFramework;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;

public class ecomm extends base1{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.Spinner").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Aman");
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElementByClassName("android.widget.Button").click();
		
		
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
//		 int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//		     for(int i=0;i<count;i++)
//		     {
//		     String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//		     if(text.equalsIgnoreCase("Jordan 6 Rings"))
//		     {
//		 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//		 break;
//		     }
//		     }
		 	driver.findElements(By.xpath("//*[@text=\"ADD TO CART\"]")).get(0).click();
		 	driver.findElements(By.xpath("//*[@text=\"ADD TO CART\"]")).get(0).click();

		     driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		     driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		     String lastpageText=    driver.findElement(By.xpath("//*[@text='Jordan 6 Rings']")).getText();
//		 String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//		 System.out.println(lastpageText);
//		 Assert.assertEquals("Jordan 6 Rings", lastpageText);
		     String totalamo = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		     totalamo = totalamo.substring(1).trim();
		     System.out.println(totalamo);
//		     String amount1= driver.findElementsByClassName("android.widget.TextView").get(0).getText();
//		     amount1 = amount1.substring(1);
		     int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		     double temp =0;
		     for(int i=0;i<count;i++)
			     {
		    	 
			     String text=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			     text = text.substring(1).trim();
			     double amount = Double.parseDouble(text);
			        
			     temp = temp+amount;
			     
	}
		     System.out.println(temp);
//		     String amount2= driver.findElementsByClassName("android.widget.TextView").get(1).getText();
//		     amount2 = amount2.substring(1);
//		     System.out.println(amount1 +" "+ amount2);
		     
		     WebElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));
		     TouchAction t = new TouchAction(driver);
		     t.tap(tapOptions().withElement(element(checkBox))).perform();
		     driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		     
		     //count context of app
		     Set<String> context = driver.getContextHandles();
		     for(String contextName:context) {
		    	 System.out.println(contextName);
		     }
		     //copy it from console
		    driver.context("WEBVIEW_com.androidsample.generalstore");	
		    driver.findElement(By.name("q")).sendKeys("hello");
		    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    //back to native app
		    driver.context("NATIVE_APP");
		 }
}