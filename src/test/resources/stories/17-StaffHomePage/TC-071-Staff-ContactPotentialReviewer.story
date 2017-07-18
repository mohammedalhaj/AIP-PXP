Scenario: TC-071 -Staff Home Page-Verify the "Contact Potential Reviewer " folder - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Contact_Potential_Reviewer
Then The Contact_Potential_Reviewer should be Contact Potential Reviewer