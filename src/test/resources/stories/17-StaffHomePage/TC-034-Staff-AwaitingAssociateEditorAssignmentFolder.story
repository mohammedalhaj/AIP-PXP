Scenario: TC-034 -Staff Home Page-Verify the "Awaiting Associate Editor Assignment" folder - Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on EditorTasks_Awaiting_Associate_Editor_Assignment
Then The Awaiting_Associate_Editor_Assignment_Header should be Awaiting Associate Editor Assignment