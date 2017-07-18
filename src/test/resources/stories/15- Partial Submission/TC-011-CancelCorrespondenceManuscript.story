Scenario: TC-011-CancelCorrespondenceManuscript

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Pending_Manuscript
And I click on Send_Manuscript_Correspondence
And I click on Cancel_btn
Then The Send_Manuscript_Correspondence should display

