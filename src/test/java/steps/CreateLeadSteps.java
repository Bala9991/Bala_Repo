package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class CreateLeadSteps {
	
	public RemoteWebDriver driver;
	
	//@Given("open the browser")
	public void openBrowsers() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
				
	}
	
	//@And("max the browser,set the timeout")
	public void browserConfig() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//@And("enter the URL")
	public void enterURL() {
		
		driver.get("http://leaftaps.com/opentaps/");
		
				
	}

	 	
	//@And("enter the username as (.*)")
	public void userName(String data) {
		driver.findElementById("username").sendKeys(data);
				
	}
	
	//@And("enter the password as (.*)")
	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
						
	}
	//@And("click login")
	public void clickLogin() {
		
		driver.findElementByClassName("decorativeSubmit").click();
						
	}
	
	//@And("click crm/sfa")
	public void crmsfaClick() {
		
		driver.findElementByLinkText("CRM/SFA").click();
						
	}

	//@And("click lead")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	//@And("click create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	//@And("enter company name as (.*)")
	public void enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	//@And("enter first name as (.*)")
	public void enterFirstName(String  data) {
		//driver.findElementByLinkText("Create Lead").click(); 
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	
	//@And("enter last name as (.*)")
	public void enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	//@When("click create lead")
	public void clickSubmitCreateLeads() {
		driver.findElementByName("submitButton").click();
	}
	
}














