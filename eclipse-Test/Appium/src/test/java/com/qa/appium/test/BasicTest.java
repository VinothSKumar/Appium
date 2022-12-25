package com.qa.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BasicTest {

	@Test
	public void AppiumTesting() throws MalformedURLException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Emulator");
		options.setApp("C:\\Users\\HP\\Downloads.ApiDemos-debug.apk");
		AndroidDriver driver=new AndroidDriver(new URL("https://127.0.0.1:4723"), options);
		
	}
	
	
}
