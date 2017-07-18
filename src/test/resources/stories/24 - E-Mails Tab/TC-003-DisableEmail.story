Scenario: TC-003- Disable

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Disable
Then The Title_Message should be 2 Links were deactivated.