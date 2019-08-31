package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdate;
	

	
	@And("Edit company name as (.*)")
	public EditLeadPage editCompanyName(String data) {
		
		type(eleCompanyName, data);
		return this;
	}
	
	@When("click update")
	public ViewLeadPage clickUpdate() {
		click(eleUpdate);
		return new ViewLeadPage();
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	

}
