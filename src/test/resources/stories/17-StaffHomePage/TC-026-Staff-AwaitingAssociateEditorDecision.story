Scenario: TC-026 -Staff Home Page-Verify the "Awaiting Associate Editor Decision" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Awaiting_Associate_Editor_Decision
Then The Awaiting_Associate_Editor_Decision_Header should be Awaiting Associate Editor Decision