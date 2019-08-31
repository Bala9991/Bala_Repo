package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='partyIdFrom']/following::a/img")
	private WebElement eleFromLeadIcon;
	
	@FindBy(how=How.XPATH,using="//input[@id='partyIdTo']/following::a")
	private WebElement eleToLeadIcon;
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement eleMerge;
	
	/*@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elefirstItemLeadList;
	*/
	
    public FindLeadsPageForMergeLead clickFromLeadIcon() {
    	click(eleFromLeadIcon);
    	switchToWindow(1);
    	return new FindLeadsPageForMergeLead();
    }
	
    
    public FindLeadsPageForMergeLead clickToLeadIcon() {
    	click(eleToLeadIcon);
    	switchToWindow(1);
    	return new FindLeadsPageForMergeLead();
    }


	public MergeLeadsPage clickMerge() {
		click(eleMerge);
		return this;
		
	}

}
	
	
	
	
	
	
	
	
	
	
	

