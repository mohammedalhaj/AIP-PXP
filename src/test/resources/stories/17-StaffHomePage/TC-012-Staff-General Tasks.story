Scenario: TC-012 -Staff Home Page- Verify the "General Tasks" section options

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Modify_Dates should be Modify Unavailability Dates
And The Staff_Update_Information should be Update Contact Information 
Then The Staff_General_Logout should be Logout 

