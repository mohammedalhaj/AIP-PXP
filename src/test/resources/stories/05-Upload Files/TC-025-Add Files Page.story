Scenario: TC-001-Verify Add Files Page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Continue
Then The Submission_Summary should display
And The Browse_btn should display
And The Save_Exit should display
And The Save_Continue should display
And The Save_Submission should display




