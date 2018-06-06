Feature: Delete a Lead


Background:

 Given enter the username as DemoSalesManager

 And enter the password as crmsfa

And click login 

And click crm/sfa

And click leads
    

Scenario Outline: Delete a Lead with mandatory field


And click Find Lead

And enter firstName as <firstName>

And click submit Find lead

And capture the id of first lead in the list

And click first lead in list

And click delete

And click Find Lead

And enter captured leadID 

And click submit Find lead

When verify the lead is deleted




Examples:

|userName|password|firstName|
|DemoSalesManager|crmsfa|bala|



Scenario Outline: Create a Lead with mandatory field

And click create Lead 

And enter company name as <companyName>

And enter first name as <firstName>

And enter last name as <lastName>

When click create lead

Examples:

|userName|password|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|self|bala|pn|


