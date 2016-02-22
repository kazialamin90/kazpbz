package com.doc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
	WebDriver driver; // Initialized my driver.
	@BeforeMethod
	public void startBrowser() // opened the browser and navigate to the docker home page.
	{
		driver=new FirefoxDriver();
		driver.get("https://hub.docker.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException //close the browser.
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
