package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Deletelead";
		testDescription="Delete a lead";
		testNodes="Leads";
		category="Smoke";
		authors="mann";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String fName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickSubmitFindLead()
		.getLeadID()
		.clickFirstListedLead()
		.clickDelete()
		.clickFindLeads()
		.enterLeadID(leadID)
		.clickSubmitFindLead()
		.verifyIsDeleted();
		
		
	}

}
