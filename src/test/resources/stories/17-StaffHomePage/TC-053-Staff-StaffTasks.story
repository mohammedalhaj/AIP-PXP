Scenario: TC-053 -Staff Home Page- Verify the existence of "Staff Tasks" section

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
Then The StaffTask should be Staff Tasks