Scenario: TC-006- Forward_Email-Cancel btn

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Forward_Email
And I click on Cancel_btn
Then The Resend should display