Scenario: TC-050 -Staff Home Page-Verify the "All Pending Manuscripts" folder -  Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_All_Pending_Manuscriptsn
Then The All_Pending_Manuscriptsn_Header should be All Pending Manuscripts