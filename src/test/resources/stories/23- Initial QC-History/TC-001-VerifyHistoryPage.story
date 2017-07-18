Scenario: TC-001-Verify	History Page

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on History_Tab
Then The history_table should display
And The Refresh_link should display

