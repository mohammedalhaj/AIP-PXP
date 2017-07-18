Scenario: TC-099- Task Tab - Check for Duplicate MS - Make Revision button

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Check_Duplicate
And I switch tabs
And I click on Make_Revision
And I click on Make_Rev_btn
Then The Title_Message should be is a revision of manuscript
