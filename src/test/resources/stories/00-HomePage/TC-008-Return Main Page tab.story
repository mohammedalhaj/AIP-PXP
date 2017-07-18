Scenario: TC-008 - Verify clicking on Return to Main Page tab

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Return_Main_Page
Then The Aip_Login_message should display