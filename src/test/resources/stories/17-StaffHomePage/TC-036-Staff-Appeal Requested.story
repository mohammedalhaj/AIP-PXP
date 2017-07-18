Scenario: TC-036 -Staff Home Page-Verify the "Appeal Requested" folder - Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on EditorTasks_Appeal_Requested
Then The Appeal_Requested_Header should be Appeal Requested  