Feature: Edit a Lead

Scenario Outline: Edit a Lead with mandatory field

Given enter the username as <userName>

And enter the password as <password>

And click login 

And click crm/sfa

And click leads

And click Find Lead

And enter firstName as <firstName>

And click submit Find lead

And click first lead in list

And click Edit

And Edit company name as <companyName>

When click update

Then verify the updation 




Examples:

|userName|password|firstName|companyName|
|DemoSalesManager|crmsfa|bala|self|
