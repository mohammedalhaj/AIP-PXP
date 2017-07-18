Scenario: TC-002-Verify	Refresh link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on History_Tab
And I click on Refresh_link
Then The history_table should display

