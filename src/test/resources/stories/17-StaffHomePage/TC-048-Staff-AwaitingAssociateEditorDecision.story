Scenario: TC-048 -Staff Home Page-Verify the "Awaiting Associate Editor Decision" folder - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Awaiting_Associate_Editor_Decision
Then The Awaiting_Associate_Editor_Decision_Header should be Awaiting Associate Editor Decision