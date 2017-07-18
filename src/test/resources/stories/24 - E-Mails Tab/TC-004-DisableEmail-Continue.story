Scenario: TC-004- Disable-Continue

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Disable
And I click on Continue
Then The Manuscript_Items should be Manuscript Items