package stepDefinitions;
	
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.junit.Cucumber;
import pageObject.HomePage;
import practice.AmazonDemo.Base;

import static org.testng.Assert.assertTrue;

import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class signInFlow extends Base{

		@Given("^Launch the url (.+) to login$")
	    public void launch_the_url_to_login(String baseurl) throws Throwable {
	    	driver=initializeDriver();
	    	driver.get(baseurl);
	    	driver.manage().window().maximize();
	    	homePageData=new HomePage(driver);
	    	homePageData.signInLocator().click();
	    	//homePageData.signIn().click();
	    }

	    @When("^enter (.+) and (.+) in the sign in page$")
	    public void enter_and_in_the_sign_in_page(String username, String password) throws Throwable {
	    	homePageData=new HomePage(driver);
	    	homePageData.emailId().sendKeys(username);
	    	homePageData.continueId().click();
	    	homePageData.password().sendKeys(password);
	    	homePageData.submitButton().click();
	    }

	    @Then("^login should be successful$")
	    public void login_should_be_successful() throws Throwable {
	    	homePageData=new HomePage(driver);
	    	boolean msg=homePageData.getCredMsg().getText().equalsIgnoreCase("Hello, Gokul");
	    	assertTrue(msg);
	    }

	}
