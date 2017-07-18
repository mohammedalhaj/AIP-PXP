Scenario: TC-001 - Verify the Footer links display and function properly

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And The Visit_APL_Online should be Visit APL Online
And The Check_Production should be Check Production Status of Accepted Manuscripts
Then The Privacy_Policy should be Privacy Policy