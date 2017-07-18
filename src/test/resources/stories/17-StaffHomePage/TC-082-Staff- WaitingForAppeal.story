Scenario: TC-082 -Staff Home Page-Verify the "Waiting for Appeal" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on  StaffTask_Waiting_for_Appeal
Then The Waiting_for_Appeal_Header should be  Waiting for Appeal