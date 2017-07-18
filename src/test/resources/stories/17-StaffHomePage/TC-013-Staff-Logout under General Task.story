Scenario:  TC-013 -Staff Home Page- Verify the functionality of "Log Out" 

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Aip_Login_message should be Home Page
And I click on Staff_General_Logout
Then The Password_user should display