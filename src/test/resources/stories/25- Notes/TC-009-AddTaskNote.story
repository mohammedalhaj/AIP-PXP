Scenario: TC-009- Add Task Note

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Notes_Tab
And I click on Add_Task_Note
And Fill Add General Note to : General_Note_textarea
And I click on Add_Task_Note
Then The Task_table should display