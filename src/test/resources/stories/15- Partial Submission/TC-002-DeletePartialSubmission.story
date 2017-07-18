Scenario: TC-002-Delete Partial Submission

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Pending_Manuscript
And I click on Delete_Partial_Submission
And I accept Dialog
Then The The_Message should be Halted manuscript deleted.