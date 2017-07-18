Scenario: TC-002- Initial_QC - Quality Assign Editor - Check for Duplicate Manuscripts

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Pass_Remaining_Items_btn
And I click on Quality_Assign_Editor_btn
And I click on tracking_number
And I click on Task_tab
Then I check For Duplicate Manuscripts
