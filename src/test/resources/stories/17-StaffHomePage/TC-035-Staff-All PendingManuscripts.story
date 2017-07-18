Scenario: TC-035 -Staff Home Page-Verify the "All Pending Manuscripts" folder - Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on EditorTasks_All_Pending_Manuscriptsn
Then The All_Pending_Manuscriptsn_Header should be All Pending Manuscripts