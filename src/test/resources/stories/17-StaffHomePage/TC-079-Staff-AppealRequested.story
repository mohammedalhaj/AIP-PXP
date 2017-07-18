Scenario: TC-079 -Staff Home Page-Verify the "Appeal Requested" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Appeal_Requested
Then The Appeal_Requested_Header should be Appeal Requested  