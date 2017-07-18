Scenario: TC-008- Add Terse Note - Edit

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
And I click on Add_Terse_Note
And Fill Add General Note to : General_Note_textarea
And I click on Add_Terse_Note
And I click on Edit_Terse_Note
Then The Edit_Terse_Note_Title should be Edit Terse Note
And I click on Edit_Terse_Note_btn
And The Notes_table should display
