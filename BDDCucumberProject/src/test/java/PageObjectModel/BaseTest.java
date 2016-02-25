package PageObjectModel;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

  FirefoxDriver dr;
  BaseTest(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	
	public HomePage start()
	{
		
		 dr.manage().window().maximize();
		 dr.get("http://www.eshopper24.com");
		
		
		return new HomePage(dr);
	}
      
	
	public void end() throws InterruptedException
	
	{
		Thread.sleep(3000);
		dr.quit();
	}
}
