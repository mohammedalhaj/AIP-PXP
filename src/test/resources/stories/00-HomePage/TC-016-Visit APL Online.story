Scenario: TC-002 - Verify the "Visit APL Online" footer link function

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Visit_APL_Online
And I switch tabs
Then The Visit_APL_Online_Page should be Applied Physics Letters