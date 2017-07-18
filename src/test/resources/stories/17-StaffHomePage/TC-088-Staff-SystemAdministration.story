Scenario: TC-088 -Staff Home Page-Verify the existence of "System Administration“ section

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
Then The System_Administration should be System Administration