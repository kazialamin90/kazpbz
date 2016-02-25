import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static FirefoxDriver dr = new FirefoxDriver();
	
	/*BaseTest(FirefoxDriver dr1)
	{
		dr=dr1;
	}
	
	public HomePage start()
	{
		 dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
		
		return new HomePage(dr);
	}*/
       public void start(){
		dr.get("http://www.eshopper24.com");
	}
	
	public void end()
	{
		dr.quit();
	}
}
