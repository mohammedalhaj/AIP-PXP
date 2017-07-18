Scenario: TC-001- Verify Notes Tab

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
Then The Add_General_Note should display
And The Add_Terse_Note should display
And The Reviewer_Note should display
And The Return_Manuscript_note should display
