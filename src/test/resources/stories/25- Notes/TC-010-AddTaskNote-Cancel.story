Scenario: TC-010- Add Terse Note - cancel

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
And I click on Add_Task_Note
And I click on Cancel_btn
Then The Add_Task_Note should display