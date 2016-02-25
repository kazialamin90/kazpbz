package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage {

FirefoxDriver dr;
	
	SearchPage(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	public void clicksearch(){
		dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[2]/div/div[2]/form/button")).click();
	}
	
	public void searchMessage(){
		System.out.println("SearchPage is display");
	}
}
