package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_Editlead";
		testDescription="Edit a lead";
		testNodes="Leads";
		category="Smoke";
		authors="mann";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String leadID,String cName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterLeadID(leadID)
		.clickSubmitFindLead()
		.clickFirstListedLead()
		.clickEdit()
		.editCompanyName(cName)
		.clickUpdate();
	
	}

}
