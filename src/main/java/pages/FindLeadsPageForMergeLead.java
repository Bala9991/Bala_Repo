package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPageForMergeLead extends ProjectMethods{
	
	public FindLeadsPageForMergeLead() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement elefromLeadID;
	
	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text']")
	private WebElement eleSubmitFindLead;
	

	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleToLeadID;
	
	/*@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elefirstItemInList;*/
	
	/*@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a")
	private WebElement elefirstItemInList;*/
	
	@FindBy(how=How.LINK_TEXT,using="10131")
	private WebElement elefirstItemInList;
	
	@FindBy(how=How.LINK_TEXT,using="10760")
	private WebElement eleToleadInList;
	
	public FindLeadsPageForMergeLead enterLeadID(String data) {
		type(elefromLeadID, data);
		return this;
	}
	
	public FindLeadsPageForMergeLead clickSubmitFindLead() {
		click(eleSubmitFindLead);
		return this;
	}
	
	public  MergeLeadsPage clickFromLeadInList() {
		clickWithNoSnap(elefirstItemInList);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	public FindLeadsPageForMergeLead enterToLeadID(String data) {
		type(eleToLeadID, data);
		return this;
	}
	
	public  MergeLeadsPage clickToLeadInList() {
		clickWithNoSnap(eleToleadInList);
		switchToWindow(0);
		return new MergeLeadsPage();
	}
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

}
