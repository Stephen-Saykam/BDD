Feature: Login to the Application

Scenario: Login through the Valid Creds
	Given Lanuch the Browser
	And Enter the URL
	Then Enter the UserName
	And Enter the Password
	Then Click on Login Button
	And Close the Browser
	
Scenario: Login through the Valid Creds
	Given Lanuch the Browser
	And Enter the URL "http://localhost:8888"
	Then Enter the UserName "admin"
	And Enter the Password "admin"
	Then Click on Login Button
	And Close the Browser
	
	Scenario: Login through the InValid Creds
	Given Lanuch the Browser
	And Enter the URL "http://localhost:8888"
	Then Enter the UserName "admin"
	And Enter the Password "admin"
	Then Click on Login Button
	And Get Current Page Title " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM"
	And Close the Browser