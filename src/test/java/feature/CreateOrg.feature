Feature: Creating Organization 

Scenario Outline: Creating an Organization 
	Given Launch the Browser 
	And Enter the url "http://localhost:8888" 
	Then Enter the un "admin" 
	And Enter the pwd "admin" 
	Then Click on LoginBtn
	And Verify Home Page " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM" 
	Then Click on Organization 
	Then Click on create Org img 
	Then Enter the Org Name "<orgname>" 
	Then Enter the Phn Nbr "<phn>" 
	And Click on Save Button 
	Then Logout from App 
	Then Close Browser 
	
	Examples: 
		|orgname   ||phn      |
		|RockWell  ||12345054 |
		|RatnaDeep ||22447545 |
		|GEEPEE    ||11225114 |
		|PayTM     ||22774475 |
		