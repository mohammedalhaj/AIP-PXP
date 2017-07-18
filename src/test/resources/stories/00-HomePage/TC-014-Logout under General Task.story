Scenario:  TC-014-Logout under General Task

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And The Aip_Login_message should be Home Page
And I click on General_Logout
Then The Password_user should display