Scenario: TC-001-Continue Partial Submission

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Pending_Manuscript
And I click on Delete_Partial_Submission
And I dismiss Dialog
Then The Delete_Partial_Submission should display