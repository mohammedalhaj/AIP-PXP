Scenario: TC-001-Continue Partial Submission

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Partial_Submission_MS
And I switch tabs
And I click on Continue_Partial_Submission
Then The Browse_btn should display