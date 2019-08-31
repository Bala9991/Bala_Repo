package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitCreateLead;
	
	@And("enter company name as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	
	@And ("enter first name as (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	

	
	@And ("enter last name as (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	

	public CreateLeadPage enterEmailID(String data) {
		type(eleEmail, data);
		return this;
	}
	
	@When("click create lead")
	public ViewLeadPage clickSubmitCreateLead() {
		click(eleSubmitCreateLead);
		return new ViewLeadPage();		
	}
	
	

}
