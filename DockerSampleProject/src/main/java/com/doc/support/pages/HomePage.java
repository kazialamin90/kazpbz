package com.doc.support.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	
	WebDriver driver;
	
	Shared sh;
	public HomePage(WebDriver driver) // Created a constructor and passed the driver.
	{
		this.driver=driver;
	}
	public void searchTextBox() // This method is used to search "java" in the search button and verifying if it's present or not. I called this method in the Smoke Test class.
	{
		sh=new Shared(driver);
		sh.type(driver.findElement(By.xpath(".//*[@id='app']/main/div[1]/nav/section/ul[3]/li[1]/div/form/div/input")), "java");
		sh.myClick(driver.findElement(By.xpath(".//*[@id='app']/main/div[1]/nav/section/ul[3]/li[1]/div/form/div/div/i")));
		sh.verifyText("java");
	}
	public void signUp() // This is the sign up scenario and I called this method in Smoke Test
	{
		sh=new Shared(driver);
		sh.type(driver.findElement(By.xpath(".//*[@id='app']/main/div[2]/header/div/div[2]/div/form/div[1]/div/input")), "Ruma12");
		sh.type(driver.findElement(By.xpath(".//*[@id='app']/main/div[2]/header/div/div[2]/div/form/div[2]/div/input")), "romana.mijee@yahoo.com");
		sh.type(driver.findElement(By.xpath(".//*[@id='app']/main/div[2]/header/div/div[2]/div/form/div[3]/div/input")), "ru12345");
		sh.myClick(driver.findElement(By.xpath(".//*[@id='app']/main/div[2]/header/div/div[2]/div/form/div[4]/button")));
	}
	
	

}
