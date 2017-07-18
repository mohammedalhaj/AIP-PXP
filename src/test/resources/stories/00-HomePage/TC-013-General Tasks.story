Scenario: TC-013 - Verify the "General Tasks" section options

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And The Modify_Dates should be Modify Unavailability Dates
And The Update_Information should be Update Contact Information 
Then The General_Logout should be Logout 

