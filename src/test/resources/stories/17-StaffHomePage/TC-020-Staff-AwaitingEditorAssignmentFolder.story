Scenario: TC-020 -Staff Home Page-Verify the "Awaiting Editor Assignment" folder - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Awaiting_Editor_Assignment
Then The Awaiting_Editor_Assignment_Header should be Awaiting Editor Assignment