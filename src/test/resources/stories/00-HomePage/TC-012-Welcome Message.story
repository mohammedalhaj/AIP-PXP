Scenario: TC-012 - Verify the homepage welcome text

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
Then The Aip_Login_message should display