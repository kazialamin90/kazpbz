import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	static FirefoxDriver dr;
	
	HomePage(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	
	public MenPage click()
	{
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")).click();
		
		return new MenPage(dr);
	}
}
