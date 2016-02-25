package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WomenPage {

FirefoxDriver dr;
	
	WomenPage(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	
	public void clickwatch(){
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/nav/ul/li[2]/a")).click();
		//System.out.println("watches category page is open");
	}
	public void watchMessage(){
		System.out.println("watches category page is open");
	}
}
