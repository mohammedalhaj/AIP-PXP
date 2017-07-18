Scenario: TC-002- Resend Email-Cancel btn

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Resend
And I switch tabs
And I click on Cancel_btn
Then The Resend should display