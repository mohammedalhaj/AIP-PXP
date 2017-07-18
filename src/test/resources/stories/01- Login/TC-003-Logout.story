Scenario:  TC-003-Logout

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And The Aip_Login_message should be Home Page
And I click on Logout
Then The Password_user should display