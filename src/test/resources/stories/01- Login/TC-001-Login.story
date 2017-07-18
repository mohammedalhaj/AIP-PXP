Scenario: TC-Login-001 - Login with username and password

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
Then The Aip_Login_message should be Home Page