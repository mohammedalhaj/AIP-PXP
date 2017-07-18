Scenario: TC-038 -Staff Home Page-Verify the "Waiting for Appeal" folder - Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on  EditorTasks_Waiting_for_Appeal
Then The Waiting_for_Appeal_Header should be  Waiting for Appeal