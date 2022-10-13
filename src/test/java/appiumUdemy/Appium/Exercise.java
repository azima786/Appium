package appiumUdemy.Appium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Exercise extends BaseTest{

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
WebElement okCancelText = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message"));
		longPressAction(okCancelText);

		System.out.println(okCancelText);

}}
