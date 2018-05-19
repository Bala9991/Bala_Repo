package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDelete;

	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicate;
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleUpdatedCompName;



	public ViewLeadPage verifyFistName(String verifyName) {
		verifyExactText(eleFirstName, verifyName);
		return this;		
	}

	  @And("click Edit")	
      public EditLeadPage clickEdit() {
    	  click(eleEdit);
    	  return new EditLeadPage();
      }
	  
	  @Then("verify the updation")
	  public ViewLeadPage verifyUpdatedCompanyName() {
	  		verifyPartialText(eleUpdatedCompName,"self");
	  		return this;
	  	  }
	  
	  @And("click delete")
      public MyLeadsPage clickDelete() {
  		click(eleDelete);
  		return new MyLeadsPage();
  	  }
      
      public DuplicateLeadPage clickDuplicate() {
    		click(eleDuplicate);
    		return new DuplicateLeadPage();
    	  }
    
}















