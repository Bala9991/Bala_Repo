package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;

	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;

	@And("click create Lead")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();		
	}
    
	@And("click Find Lead")
	public FindLeadsPage clickFindLeads(){

		click(eleFindLeads);

		return new FindLeadsPage();
	}

	public MergeLeadsPage clickMergeLeads() {
		click(eleMergeLeads);
		return new MergeLeadsPage();		
	}

}








