Scenario: TC-007- Add Terse Note - cancel

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
And I click on Add_Terse_Note
And I click on Cancel_btn
Then The Notes_table should display