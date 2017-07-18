Scenario: TC-078 -Staff Home Page-Verify the "Post Decision" folder  - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Post_Decision
Then The Post_Decision_Header should be Post Decision