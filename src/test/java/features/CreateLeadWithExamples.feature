Feature: Create Lead

@sanity
Scenario Outline: Create a Lead with mandatory field

Given enter the username as <userName>

And enter the password as <password>


And click login 


And click crm/sfa

And click leads

And click create Lead

And enter company name as <companyName>

And enter first name as <firstName>

And enter last name as <lastName>

When click create lead

Examples:

|userName|password|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|self|bala|pn|





