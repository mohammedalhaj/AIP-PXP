Scenario: TC-122- Task Tab - Check for Flagged Persons - Previous Decision Link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Check_Duplicate
And I switch tabs
And I click on Make_Revision
And I click on Previous_Decision_link
Then The Overall_Assessment should be Associate Editor's Overall Assessment
