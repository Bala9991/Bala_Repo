package pages_paypal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpForFreePage extends ProjectMethods {
	
	public SignUpForFreePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleRadio;
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;
	
	
	
	public SignUpForFreePage clickForShoppers() {
		boolean selected = verifySelected(eleRadio);
		if(!selected) {
			click(eleRadio);
		}
		
		return this;
	}
	
	public AccountCreatePage clickNext() {
		click(eleNext);
		return new AccountCreatePage();
	}

}
