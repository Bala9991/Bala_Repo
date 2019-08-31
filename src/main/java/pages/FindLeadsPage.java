package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadID;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleSubmitFindLead;
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmail;
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAddress;

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elefirstItemLeadList;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstLeadID;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleNoRecordsInfo;
	
	@And("enter leadID as (.*)")
	public FindLeadsPage enterLeadID(String data) {
		type(eleLeadID, data);
		return this;
	}
	
	@And("enter firstName as (.*)")
	public FindLeadsPage enterFirstName(String data){
		type(eleFirstName, data);
		return this;
	}
	
	public FindLeadsPage clickEmailTab() {
		click(eleEmail);
		return this;
	}
	
	public FindLeadsPage enterEmailID(String data){
		type(eleEmailAddress, data);
		return this;
	}
	
	@And("click submit Find lead")
	public FindLeadsPage clickSubmitFindLead() {
		click(eleSubmitFindLead);
		return this;
	}
	
	@And("click first lead in list")
	public  ViewLeadPage clickFirstListedLead() {
		click(elefirstItemLeadList);
		return new ViewLeadPage();
	}
	
	@And("capture the id of first lead in the list")
     public FindLeadsPage getLeadID() {
        	leadID= getLeadID(eleFirstLeadID);
        	 return this;
	}
	
	@And("enter captured leadID")
	public FindLeadsPage enterCapturedLeadID() {
		type(eleLeadID, leadID);
		return this;
	}
	
	@When("verify the lead is deleted")
    public FindLeadsPage verifyIsDeleted() {
    	
    	verifyPartialText(eleNoRecordsInfo, "No records to display");
    	return this;
    }  
		

}
