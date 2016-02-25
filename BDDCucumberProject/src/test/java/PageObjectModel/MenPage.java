package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenPage {

FirefoxDriver dr;
	
	MenPage(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	
	public void shoecategory(){
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/nav/ul/li[2]/a")).click();
		
		
	}
	public void shoeMessage(){
		System.out.println("shoe category page is open");
	}
}
