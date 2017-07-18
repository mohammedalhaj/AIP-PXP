Scenario: TC-011- Add Task Note - Edit

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
And I click on Add_Task_Note
And Fill Add General Note to : General_Note_textarea
And I click on Add_Task_Note
And I click on Edit_Task_Note
And The Edit_Task_Note_Title should be Edit Manuscript Task Note
And I click on Edit_Manuscript_Task_Note_btn
Then The Task_Notes_Title should be Task Notes
