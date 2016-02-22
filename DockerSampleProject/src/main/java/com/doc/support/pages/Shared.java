package com.doc.support.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared //This is my shared class
{
WebDriver driver;
	
	
	public Shared(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyText(String text) //I will call this method whenever I have to verify the text
	{
		try{
			driver.getPageSource().contains(text);
			System.out.println(text+" found");
		}catch(Exception e)
		{
			System.out.println(text +"  not found");
		}
	}
	
	public void myClick(WebElement ele) //This method is used whenever I need to click on a button
	{
		try
		{
			ele.click();
			System.out.println("clicked");
		}catch(NoSuchElementException e)
		{
			System.out.println("element not found");
		}
	}
	
	public void type(WebElement ele, String text) // This method will be called when we need to verify an element.
	{
		try
		{
			ele.sendKeys(text);
		}catch(NoSuchElementException e)
		{
			System.out.println("element not found");
		}
		
		
	}
	public void getText(WebElement  elementText, String text) // This method will be called when we are trying to find a text.
	{
		try{
			elementText.getText().contains(text);
			System.out.println(text+" match");
		}catch(Exception e)
		{
			System.out.println(text +"  not match");
		}
	}



}
