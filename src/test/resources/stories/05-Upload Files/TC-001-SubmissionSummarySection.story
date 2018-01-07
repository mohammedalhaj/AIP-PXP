Scenario: TC-001- Upload file-Verify the "submission summary" section at the top left of the page
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
Then The Submission_Summary should display
And The Submission_Summary should be Submission Summary

