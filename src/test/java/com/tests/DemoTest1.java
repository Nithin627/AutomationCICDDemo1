package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void browserTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // modern headless mode
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

	}

}
