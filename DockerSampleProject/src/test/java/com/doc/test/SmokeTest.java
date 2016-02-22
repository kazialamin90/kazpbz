package com.doc.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.doc.support.pages.HomePage;
import com.doc.support.pages.Shared;

public class SmokeTest extends BaseTest //I extended the BaseTest class so it can have the methods that are present there so it will open and close the browser
{
	HomePage hp;
	@Test //this is Test Case 1
	public void verifySearchEngine() // I am verifying the Search engine.
	{
		hp=new HomePage(driver);
		hp.searchTextBox();
	}
	
	//for login senario
	@Test(dataProvider="login") // This is Test case 2 
	public void verifyLogin(String userName, String password) throws InterruptedException // I am verifying a login scenario
	{
		driver.findElement(By.xpath(".//*[@id='app']/main/div[1]/nav/section/ul[3]/li[2]/a")).click();
		Thread.sleep(2000); //This will wait for 2 seconds for the page to load.
		driver.findElement(By.xpath(".//*[@id='app']/main/div/header/div[2]/div/form/div[1]/input")).sendKeys(userName);
		driver.findElement(By.xpath(".//*[@id='app']/main/div/header/div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("..//*[@id='app']/main/div/header/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(2000);
	}
	
	@DataProvider(name="login")
	public Object[][] getData()
	{
		return new Object [][] {{"romana","1234"},{"miji","12345"}};
	}
	
//verify text
	Shared sh;
	@Test // This is Test Case 3
	public void verifyWebText() // I am verifying if a Web text is present or not.
	{
		sh=new Shared(driver);
		sh.getText(driver.findElement(By.xpath(".//*[@id='app']/main/div[2]/header/div/div[1]/p")), "apps");
	}
	
	@Test // This is Test Case 4
	public void signUp() // I am signing up for a first time.
	{
		hp=new HomePage(driver);
		hp.signUp();
		
	}
	
	@Test // This is Test Case 5
	public void verifyElementsLink() throws InterruptedException
	{
		sh=new Shared(driver);
		sh.type(driver.findElement(By.xpath(".//*[@id='app']/main/div[1]/nav/section/ul[3]/li[1]/div/form/div/input")), "java");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/main/div[1]/nav/section/ul[3]/li[1]/div/form/div/div/i")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// I am seacrhing "java" and hitting enter and then performing a for loop to click each box that appeared.

		List<WebElement> elements=driver.findElements(By.xpath(".//*[@id='app']/main/div[2]/div[2]/div[2]/div/ul/li/a/div[1]/div[2]/div[1]"));
		for(WebElement element:elements)
		{
			element.click();
			driver.navigate().back(); 
			Thread.sleep(2000);
		}
	}
}
