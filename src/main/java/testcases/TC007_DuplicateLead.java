package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Deletelead";
		testDescription="Delete a lead";
		testNodes="Leads";
		category="Smoke";
		authors="mann";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd,String email) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailID(email)
		.clickSubmitFindLead()
		.clickFirstListedLead()
		.clickDuplicate()
		.clickCreateLead_Duplicate();
	}

}
