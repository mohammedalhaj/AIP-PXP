Scenario: TC-003 - Verify the "Check Production Status of Accepted Manuscripts" footer link function

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Check_Production
And I switch tabs
Then The Check_Production_Page should be Accepted Manuscript Status Inquiry System