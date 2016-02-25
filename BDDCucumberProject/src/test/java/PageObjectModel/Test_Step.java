package PageObjectModel;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step {
	FirefoxDriver dr;
	BaseTest bt;
	HomePage hp;
	MenPage mp;
	WomenPage wp;
	SearchPage sp;

	@Before
	public void open(){
		dr=new FirefoxDriver();
	}
	@After
	public void close(){
		dr.quit();
	}
	
	
	@Given("^I open Browser and go to Eshopper(\\d+)$")
	public void i_open_Browser_and_go_to_Eshopper(int arg1) throws Throwable {
	    
		bt=new BaseTest(dr);
		hp=bt.start();
		
		
	}

	@When("^Click on menlink from the header$")
	public void click_on_menlink_from_the_header() throws Throwable {
		mp=hp.clickmen();
	    
	    
	}

	@When("^Select shoe category$")
	public void select_shoe_category() throws Throwable {
		mp.shoecategory();
	}

	@Then("^I should be redirected to shoepage$")
	public void i_should_be_redirected_to_shoepage() throws Throwable {
	    
		mp.shoeMessage();

	}

	@When("^Click on womenlink from the header$")
	public void click_on_womenlink_from_the_header() throws Throwable {
	    
		wp=hp.clickwomen();
	}

	@When("^Select watches category$")
	public void select_watches_category() throws Throwable {
	    wp.clickwatch();
	}

	@Then("^I should be redirected to watchespage$")
	public void i_should_be_redirected_to_watchespage() throws Throwable {
		wp.watchMessage();
		//System.out.println("watches category page is Display");
	}

	@When("^Search for products \"([^\"]*)\"$")
	public void search_for_products(String searchText) throws Throwable {
	    sp=hp.clicksearch(searchText);
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
	    sp.clicksearch();
	}

	@Then("^I should get expected result$")
	public void i_should_get_expected_result() throws Throwable {
	   sp.searchMessage();
	}
	


}
