package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
FirefoxDriver dr;
	
	HomePage(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	
	public MenPage clickmen(){
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a/b")).click();
		return new MenPage(dr);
	}
	public WomenPage clickwomen(){
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();
		return new WomenPage(dr);
		
	}
	public SearchPage clicksearch(String searchText){
		dr.findElement(By.xpath(".//*[@id='small-searchterms']")).sendKeys(searchText);
		//dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[2]/div/div[2]/form/button")).click();
		return new SearchPage(dr);
	}

}
