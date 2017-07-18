Scenario: TC-080 -Staff Home Page-Verify the "Accepted - Waiting for Production" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Accepted_Waiting_For_Production
Then The StaffTask_Accepted_Waiting_For_Production_Header should be Accepted - Waiting for Production
