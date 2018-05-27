package pages_paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountCreatePage extends ProjectMethods {
	
	public AccountCreatePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleEmail;
	
	@FindBy(how=How.XPATH,using="//label[text()='Password']")
	private WebElement elePassword;
	
	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement eleContinue;
	
	
	public AccountCreatePage selectCountry(String data) {
		selectDropDownUsingText(eleCountry, data);
		return this;
	}
	
	public AccountCreatePage typeEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	
	public AccountCreatePage typePassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	public void clickContinue() {
		click(eleContinue);
	}
	
	

}
