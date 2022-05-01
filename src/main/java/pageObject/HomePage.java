package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signIn;
	
	@FindBy(id="nav-link-accountList")
	WebElement signInLocator;
	
	@FindBy(id="ap_email")
	WebElement emailId;
	
	@FindBy(id="continue")
	WebElement continueId;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement credMsg;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement signIn() {
		return signIn;
	}
	
	public WebElement signInLocator() {
		return signInLocator;
	}
	
	public WebElement emailId() {
		return emailId;
	}
	
	public WebElement continueId() {
		return continueId;
	}
	
	public WebElement password() {
		return pwd;
	}
	
	public WebElement submitButton() {
		return submit;
	}
	
	public WebElement getCredMsg() {
		return credMsg;
	}

}
