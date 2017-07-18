Scenario:  TC-005- Verify Modify Unavailability Dates - Wrong data

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Modify_Unavailability_Dates
And Fill empty to : October
And Fill Test to : October
And I click on Submit_Dates
Then The Error_Message should be The following days are invalid.

