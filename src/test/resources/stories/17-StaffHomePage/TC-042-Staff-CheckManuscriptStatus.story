Scenario: TC-042 -Staff Home Page- Verify the functionality of "Check Manuscript Status" link - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Check_Manuscript_Status
Then The ManuscriptNumber should be Manuscript #
