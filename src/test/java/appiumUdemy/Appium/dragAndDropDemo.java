package appiumUdemy.Appium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class dragAndDropDemo extends BaseTest{

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

		dragAndDropAction(source, 834,737);
		Thread.sleep(2000);

		String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(result, "Dropped!");
}}
