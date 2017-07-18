Scenario:  TC-002- Verify Modify Unavailability Dates - one day

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Modify_Unavailability_Dates
And Fill empty to : October
And Fill 12 to : October
And I click on Submit_Dates
Then The Change_Dates should display

