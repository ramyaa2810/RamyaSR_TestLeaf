Feature: Create Lead
#Scenario: Create Lead with mandatory fields
Scenario Outline: Create Lead with mandatory fields
#Given Invoke LeafTap app
Given Enter UserName as <userName>
And Enter Password as <password>
And Enter Click Login
And Click CRMSFA
And Click Leads Tab
And Click Create Lead
When Enter Company Name as <companyName>
And Enter First Name as <firstName>
And Enter Last Name as <lastName>
And Enter Email as <email>
And Enter PhoneNumber as <phone>
And Click Create lead button
Then Verify Lead created successfully <firstName>
Examples:
|userName|password|companyName|firstName|lastName|email|phone|
|DemoSalesManager|crmsfa|Cognizant|Ramya|SR|rmy@gmail.com|9677324402|
|DemoCSR|crmsfa|Genesys|Mukunthan|A|mukunth@gmail.com|9790847725|