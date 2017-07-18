Scenario: TC-008 -Staff Home Page- Verify clicking on Return to Main Page tab

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Return_Main_Page
Then The Staff_Aip_Login_message should display
And The Staff_Aip_Login_message should be Home Page
