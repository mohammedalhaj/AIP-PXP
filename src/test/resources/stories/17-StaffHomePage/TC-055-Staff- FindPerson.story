Scenario: TC-055 -Staff Home Page-Verify the functionality of "Find Person" link - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Find_Person
Then The FirstName should be First Name
