Scenario:  TC-007-Modify Dates Multi Time

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Modify_Unavailability_Dates
And Fill empty to : October
And Fill 12 to : October
And I click on Submit_Dates
And I click on Change_Dates
And Fill 8-9 to : November
And I click on Submit_Dates
And I click on Submit_Dates
Then The Recorded_Message should be Unavailability Dates Recorded

