import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PagestepDefinition extends BaseTest{
	//static FirefoxDriver dr=new FirefoxDriver();
	//BaseTest b;
	HomePage h;
	MenPage m;
	
	@Given("^I open eshopper$")
	public void i_open_eshopper() throws Throwable {
		//b=new BaseTest(dr);
				start();
				
	}

	@When("^i click men$")
	public void i_click_men() 
	{
	  h =new HomePage(dr);
	  m=h.click();
	}

	@Then("^i should be manpage$")
	public void i_should_be_manpage() 
	{
	    end();
	}


}
