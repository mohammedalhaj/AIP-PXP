Scenario: TC-001-Staff - Check Manuscript Status

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Check_Manuscript_Status
Then Verify the content of the check MS page
