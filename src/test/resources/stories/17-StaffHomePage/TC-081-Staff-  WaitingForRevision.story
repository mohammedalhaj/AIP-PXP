Scenario: TC-081 -Staff Home Page-Verify the "Waiting for Revision" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on  StaffTask_Waiting_for_Revision
Then The Waiting_for_Revision_Header should be  Waiting for Revision