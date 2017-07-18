Scenario: TC-001- Initial_QC - Quality_Ok_btn

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Pass_Remaining_Items_btn
And I click on Quality_Ok_btn
Then The Initial_QC_complete_Msg should be Initial QC complete.

