package testcases_paypal;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages_paypal.Login_PayPal;
import wdMethods.ProjectMethods;

public class TC001_signUp extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC001_signUp";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider="fetchData",groups= {"all"})
	public void signUp(String country,String email,String password) {
		
		new Login_PayPal()
		.clickSignUp()
		.clickForShoppers()
		.clickNext()
		.selectCountry(country)
		.typeEmail(email)
		.typePassword(password)
		.clickContinue();
	}
	
}
