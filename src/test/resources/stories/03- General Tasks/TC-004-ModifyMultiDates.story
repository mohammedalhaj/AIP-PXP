Scenario:  TC-004- Verify Modify Unavailability Dates - Multi dates

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Modify_Unavailability_Dates
And Fill empty to : October
And Fill 7,20,22 to : October
And I click on Submit_Dates
Then The Change_Dates should display
