package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import engine.Driverconfiguration;
import pageObjects.Payment;


public class Paymentdefinitions {
	
	private static final Logger LOGGER = Logger.getLogger(Paymentdefinitions.class);
	public WebDriver driver;
	WebDriverWait wait;
	Payment pay;
	
	@Before()
    public void setUp(){
		 LOGGER.info("----------------------------Start of Scenario--------------------------------");
		 LOGGER.info("Start the browser and Clear the cookies");
		 driver = Driverconfiguration.createchromedriver();  
		 pay = new Payment(driver);
    } 
	
	@After()
    public void tearDown(){
		LOGGER.info("Log out and close the driver and browser");
		driver.close();	   
        LOGGER.info("----------------------------End of Scenario-----------------------------");
    } 
	
	@Given("^the User is on Setting page of craftnote and wants to take a pro plan$")
	public void the_User_is_on_Setting_page_of_craftnote_and_wants_to_take_a_pro_plan(DataTable data)  {
		List<Map<String, String>> testdata = data.asMaps(String.class, String.class);
		
		LOGGER.info("Loading the home page of craftnote .."+testdata.get(0).get("home_page"));
		pay.navigateTo_HomePage(testdata.get(0).get("home_page"));
		LOGGER.info("Waiting for the homepage to load... ");
		pay.waituntilhomepageisloaded();
		 
		LOGGER.info("Validating if the homepage of craftnote is loaded or not");
		Assert.assertEquals(pay.getPageTitle(), "Craftnote");
		
	    
	}

	@When("^the user clicks on upgrade to pro plan$")
	public void the_user_clicks_on_upgrade_to_pro_plan() {
	   
	}

	@When("^enters the subscription details$")
	public void enters_the_subscription_details(DataTable arg1) throws Throwable {
	  
	}

	@When("^enters the Billing information$")
	public void enters_the_Billing_information(DataTable arg1) {
	   
	}

	@When("^enters the Payment Method$")
	public void enters_the_Payment_Method()  {
		
	}
	
	    

	@Then("^the summary of the payment is shown$")
	public void the_summary_of_the_payment_is_shown(){
	   
	}

	@Then("^user clicks on paynow to confirm subscription$")
	public void user_clicks_on_paynow_to_confirm_subscription()  {
	    
	}

}
