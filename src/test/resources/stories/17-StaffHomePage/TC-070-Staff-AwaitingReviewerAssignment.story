Scenario: TC-070 -Staff Home Page-Verify the "Awaiting Reviewer Assignment" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Awaiting_Reviewer_Assignment
Then The Awaiting_Reviewer_Assignment should be Awaiting Reviewer Assignment