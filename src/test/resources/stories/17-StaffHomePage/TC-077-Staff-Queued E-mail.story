Scenario: TC-077 -Staff Home Page-Verify the "Queued E-mail" folder  - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Queued_Email
Then The Date should be Date: