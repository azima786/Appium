package appiumUdemy.Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.Clipboard;
import java.net.MalformedURLException;

public class MiscAppiumActions extends BaseTest{

	@Test
	public void AppiumTest() throws MalformedURLException {

		//App package and app activity - To go directly to that page instead of following steps
		Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
driver.startActivity(activity);

		//Actual Automation
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();

		//to turn into landscape
		DeviceRotation landscape = new DeviceRotation(0,0,90);
		driver.rotate(landscape);

		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");

		//clipboard content
		driver.setClipboardText("WIFI");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElements(By.className("android.widget.Button")).get(1).click();

		//By Creating object you can use any key method
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		
	}
	
}
