Scenario: TC-073 -Staff Home Page-Verify the "Awaiting Associate Editor Decision" folder  - staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Awaiting_Associate_Editor_Decision
Then The Awaiting_Associate_Editor_Decision_Header should be Awaiting Associate Editor Decision