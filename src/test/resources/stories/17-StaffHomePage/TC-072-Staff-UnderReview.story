Scenario: TC-072 -Staff Home Page-Verify the "Under Review" folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Under_Review
Then The Under_Review_Header should be Under Review