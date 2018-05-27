package pages_paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Login_PayPal extends ProjectMethods {
	
	public Login_PayPal() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignup;
	
	public SignUpForFreePage clickSignUp() {
		click(eleSignup);
		return new SignUpForFreePage();
		
	}
	
	

}
