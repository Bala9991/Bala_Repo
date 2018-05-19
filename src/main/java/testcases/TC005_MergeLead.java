package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPageForMergeLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Mergelead";
		testDescription="Merge a lead";
		testNodes="Leads";
		category="Smoke";
		authors="mann";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String fromleadID,String toLeadID) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterLeadID(fromleadID)
		.clickSubmitFindLead()
		.clickFromLeadInList()
		.clickToLeadIcon()
		.enterToLeadID(toLeadID)
		.clickSubmitFindLead()
		.clickToLeadInList()
		.clickMerge()
		.acceptAlert();
		
	}

}
